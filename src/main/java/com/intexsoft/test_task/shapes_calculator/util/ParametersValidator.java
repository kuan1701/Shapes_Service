package com.intexsoft.test_task.shapes_calculator.util;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParametersValidator {
    public boolean isValidParameters(List<Double> parameters) {
        return parameters.stream().allMatch(parameter -> parameter >= 0.0);
    }
}
