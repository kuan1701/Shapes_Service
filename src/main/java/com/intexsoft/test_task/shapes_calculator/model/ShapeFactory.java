package com.intexsoft.test_task.shapes_calculator.model;

import com.intexsoft.test_task.shapes_calculator.model.entity.Circle;
import com.intexsoft.test_task.shapes_calculator.model.entity.Rectangle;
import com.intexsoft.test_task.shapes_calculator.model.entity.Square;
import com.intexsoft.test_task.shapes_calculator.model.entity.Triangle;

import java.util.List;

public class ShapeFactory {
    //use getShape method to get object of type shape
    public static Shape getShape(String shapeType, List<Double> parameters) {
        switch (shapeType.trim().toUpperCase()) {
            case "CIRCLE":
                return new Circle(parameters.get(0));
            case "RECTANGLE":
                return new Rectangle(parameters.get(0), parameters.get(1));
            case "TRIANGLE":
                return new Triangle(parameters.get(0), parameters.get(1), parameters.get(2));
            case "SQUARE":
                return new Square(parameters.get(0));
            default:
                return null;
        }
    }
}
