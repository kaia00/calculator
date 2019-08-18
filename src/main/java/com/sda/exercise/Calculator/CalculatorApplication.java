package com.sda.exercise.Calculator;

import com.sda.exercise.Calculator.operations.Operation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		UserInput userInput = new UserInput();


		System.out.println("First nr");
		userInput.setNum1(scanner.nextDouble());

		System.out.println("Operator:");
		String operator = scanner.next().toUpperCase();
		userInput.setOperator(Operation.valueOf(operator));

		System.out.println("Second nr");
		userInput.setNum2(scanner.nextDouble());

		CalculatorFactory.getFactory(userInput);

	}

}
