package com.Calculator_UnitTests2.Calculator_UnitTests2;

public class Calculator {

    private int fistNumber;
    private int secondNumber;

    public void setFistNumber(int fistNumber) {
        this.fistNumber = fistNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFistNumber() {
        return fistNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public Integer Addition(){
        int sum = 0;
        sum = this.fistNumber + this.secondNumber;
        return sum;
    }

    public Integer Substraction(){
        int subtr = 0;
        subtr = this.fistNumber - this.secondNumber;
        return subtr;
    }

    public Integer Multiplication(){
        int mult = 0;
        mult = this.fistNumber * this.secondNumber;
        return mult;
    }

    public Integer Division() {
        int div = 0;
        try {
            if (this.secondNumber == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            } else {
                div = this.fistNumber / this.secondNumber;

            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return div;
    }
}
