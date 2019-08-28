package com.sda.exercise.Calculator.controller;

import com.sda.exercise.Calculator.CalculatorFactory;
import com.sda.exercise.Calculator.UserInput;
import com.sda.exercise.Calculator.exceptions.CannotDivideByZeroException;
import com.sda.exercise.Calculator.operations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping("/add")
    public double add(@RequestBody UserInput userInput){
        userInput.setOperator(Operation.ADD);
        return CalculatorFactory.getFactory(userInput).calculate(userInput);
    }

    @PostMapping("/div")
    public double divide(@RequestBody UserInput userInput) throws CannotDivideByZeroException {
        userInput.setOperator(Operation.DIVIDE);
        if(userInput.getNum2() == 0){
            throw new CannotDivideByZeroException("You cannot divide by zero");
        }
        return CalculatorFactory.getFactory(userInput).calculate(userInput);
    }

    @PostMapping("/mul")
    public double multiply(@RequestBody UserInput userInput){
        userInput.setOperator(Operation.MULTIPLY);
        return CalculatorFactory.getFactory(userInput).calculate(userInput);
    }

    @PostMapping("/sub")
    public double subtract(@RequestBody UserInput userInput){
        userInput.setOperator(Operation.SUBTRACT);
        return CalculatorFactory.getFactory(userInput).calculate(userInput);
    }

}
