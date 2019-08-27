package com.sda.exercise.Calculator.operations;

import com.sda.exercise.Calculator.UserInput;
import com.sda.exercise.Calculator.exceptions.CannotDivideByZeroException;

public interface Calculator {

    double calculate(UserInput userInput);
}
