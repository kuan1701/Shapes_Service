package com.intexsoft.test_task.shapes_calculator.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {

    private final Double width;
    private final Double height;

    @Override
    public Double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public Double getSquare() {
        return width * height;
    }
}
