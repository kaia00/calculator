package com.sda.exercise.Calculator.operations;

import com.sda.exercise.Calculator.UserInput;


public class Division implements Calculator {

    @Override
    public double calculate(UserInput userInput) {
        return userInput.getNum1() / userInput.getNum2();
    }
}
