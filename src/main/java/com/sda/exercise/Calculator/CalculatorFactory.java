package com.sda.exercise.Calculator;

import com.sda.exercise.Calculator.operations.*;

public class CalculatorFactory {

    public static Calculator getFactory(UserInput userInput) {

        switch (userInput.getOperator()) {
            case ADD:
                return new Adding();
            case DIVIDE:
                return new Division();
            case MULTIPLY:
                return new Multiplication();
            case SUBTRACT:
                return new Subtraction();
        }
        return null;
    }
}
