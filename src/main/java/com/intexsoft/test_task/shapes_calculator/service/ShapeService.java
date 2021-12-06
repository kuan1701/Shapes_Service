package com.intexsoft.test_task.shapes_calculator.service;

import com.intexsoft.test_task.shapes_calculator.dto.RequestDto;
import com.intexsoft.test_task.shapes_calculator.service.factory.ShapeFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShapeService {

  public Double getPerimeterOfShape(RequestDto requestDto) {
    return ShapeFactory.getShape(requestDto).getPerimeter();
  }

  public Double getSquareOfShape(RequestDto requestDto) {
    return ShapeFactory.getShape(requestDto).getSquare();
  }
}