package com.sda.exercise.Calculator;

import com.sda.exercise.Calculator.operations.Operation;

public class UserInput {

    private double num1;
    private double num2;
    private Operation operator;

    public Operation getOperator() {
        return operator;
    }

    public void setOperator(Operation operator) {
        this.operator = operator;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }


}
