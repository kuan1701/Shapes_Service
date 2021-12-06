package com.intexsoft.test_task.shapes_calculator.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle implements Shape {

    private final Double sideA;
    private final Double sideB;
    private final Double sideC;

    @Override
    public Double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public Double getSquare() {
        Double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
