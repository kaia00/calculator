package com.sda.exercise.Calculator.operations;

import com.sda.exercise.Calculator.UserInput;
import com.sda.exercise.Calculator.exceptions.CannotDivideByZeroException;


public class Division implements Calculator {

    @Override
    public double calculate(UserInput userInput){

            return userInput.getNum1() / userInput.getNum2();
    }
}
