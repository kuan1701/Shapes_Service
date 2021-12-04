package com.intexsoft.test_task.shapes_calculator.model.entity;

import com.intexsoft.test_task.shapes_calculator.model.Shape;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Shape {

    private final Double width;

    @Override
    public Double getPerimeter() {
        return width * 4;
    }

    @Override
    public Double getSquare() {
        return width * width;
    }
}