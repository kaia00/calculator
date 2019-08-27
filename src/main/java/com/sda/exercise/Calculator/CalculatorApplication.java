package com.sda.exercise.Calculator;

import com.sda.exercise.Calculator.exceptions.CannotDivideByZeroException;
import com.sda.exercise.Calculator.exceptions.OperationNotFoundException;
import com.sda.exercise.Calculator.operations.Operation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) throws OperationNotFoundException, CannotDivideByZeroException {

        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();

        System.out.println("First nr");
        userInput.setNum1(scanner.nextDouble());

        System.out.println("Choose operation: add, subtract, divide, multiply.");
        String operator = scanner.next().toUpperCase();

        if (!operator.equalsIgnoreCase("add") && !operator.equalsIgnoreCase("divide") &&
                !operator.equalsIgnoreCase("multiply") && !operator.equalsIgnoreCase("subtract")) {
            throw new OperationNotFoundException("Invalid operation");
        } else {
            userInput.setOperator(Operation.valueOf(operator));
        }

        System.out.println("Second nr");
        double num2 = scanner.nextDouble();
        if (num2 == 0 && operator.equalsIgnoreCase("divide")) {
            throw new CannotDivideByZeroException("You cannot divide by zero");
        } else {
            userInput.setNum2(num2);
        }
        System.out.println(CalculatorFactory.getFactory(userInput).calculate(userInput));
    }
}
