package com.intexsoft.test_task.shapes_calculator.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {

    private final Double radius;
    private final Double PI = Math.PI;

    @Override
    public Double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public Double getSquare() {
        return PI * Math.pow(radius, 2);
    }
}
