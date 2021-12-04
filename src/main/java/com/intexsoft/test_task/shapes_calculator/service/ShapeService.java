package com.intexsoft.test_task.shapes_calculator.service;

import com.intexsoft.test_task.shapes_calculator.model.Shape;
import com.intexsoft.test_task.shapes_calculator.model.ShapeFactory;
import com.intexsoft.test_task.shapes_calculator.util.ParametersValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShapeService {

    private final ParametersValidator parametersValidator;

    public Double getPerimeterOfShape(String type, List<Double> parameters) {
        if (parametersValidator.isValidParameters(parameters)) {
            Shape shape = ShapeFactory.getShape(type, parameters);
            assert shape != null;
            return shape.getPerimeter();
        }
        return null;
    }

    public Double getSquareOfShape(String type, List<Double> parameters) {
        if (parametersValidator.isValidParameters(parameters)) {
            Shape shape = ShapeFactory.getShape(type, parameters);
            assert shape != null;
            return shape.getSquare();
        }
        return null;
    }
}
