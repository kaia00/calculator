package com.sda.exercise.Calculator.controller;

import com.sda.exercise.Calculator.CalculatorFactory;
import com.sda.exercise.Calculator.UserInput;
import com.sda.exercise.Calculator.exceptions.DivideByZeroException;
import com.sda.exercise.Calculator.operations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody UserInput userInput) {
        userInput.setOperator(Operation.ADD);
        double result = CalculatorFactory.getFactory(userInput).calculate(userInput);
        return new ResponseEntity(result, HttpStatus.OK);

    }

    @PostMapping("/div")
    public ResponseEntity divide(@RequestBody UserInput userInput) throws DivideByZeroException {
        userInput.setOperator(Operation.DIVIDE);
        if (userInput.getNum2() == 0) {
            throw new DivideByZeroException("You cannot divide by zero");
        }
        double result = CalculatorFactory.getFactory(userInput).calculate(userInput);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping("/mul")
    public ResponseEntity multiply(@RequestBody UserInput userInput) {
        userInput.setOperator(Operation.MULTIPLY);
        double result = CalculatorFactory.getFactory(userInput).calculate(userInput);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping("/sub")
    public ResponseEntity subtract(@RequestBody UserInput userInput) {
        userInput.setOperator(Operation.SUBTRACT);
        double result = CalculatorFactory.getFactory(userInput).calculate(userInput);
        return new ResponseEntity(result, HttpStatus.OK);
    }

}
