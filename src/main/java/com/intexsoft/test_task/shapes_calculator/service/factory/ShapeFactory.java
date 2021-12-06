package com.intexsoft.test_task.shapes_calculator.service.factory;

import com.intexsoft.test_task.shapes_calculator.dto.RequestDto;
import com.intexsoft.test_task.shapes_calculator.model.Circle;
import com.intexsoft.test_task.shapes_calculator.model.Rectangle;
import com.intexsoft.test_task.shapes_calculator.model.Shape;
import com.intexsoft.test_task.shapes_calculator.model.Square;
import com.intexsoft.test_task.shapes_calculator.model.Triangle;
import java.security.InvalidParameterException;

public class ShapeFactory {

  //use getShape method to get object of type shape
  public static Shape getShape(RequestDto requestDto) {
    switch (requestDto.getType().trim().toUpperCase()) {
      case "CIRCLE":
        return new Circle(requestDto.getParameters().get(0));
      case "RECTANGLE":
        return new Rectangle(requestDto.getParameters().get(0), requestDto.getParameters().get(1));
      case "TRIANGLE":
        return new Triangle(requestDto.getParameters().get(0), requestDto.getParameters().get(1),
            requestDto.getParameters().get(2));
      case "SQUARE":
        return new Square(requestDto.getParameters().get(0));
      default:
        throw new InvalidParameterException();
    }
  }
}
