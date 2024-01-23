package com.Calculator_UnitTests2.Calculator_UnitTests2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition(){
        Calculator calculator = new Calculator();
        calculator.setFistNumber(5);
        calculator.setSecondNumber(3);
        assertEquals(8, calculator.Addition());
    }

    @Test
    void testSubstraction(){
        Calculator calculator = new Calculator();
        calculator.setFistNumber(8);
        calculator.setSecondNumber(5);
        assertEquals(3, calculator.Substraction());
    }

    @Test
    void testMultiplication(){
        Calculator calculator = new Calculator();
        calculator.setFistNumber(5);
        calculator.setSecondNumber(2);
        assertEquals(10, calculator.Multiplication());
    }

    @Test
    void testDivision(){
        Calculator calculator = new Calculator();
        calculator.setFistNumber(15);
        calculator.setSecondNumber(3);
        assertEquals(5, calculator.Division());
    }

    @Test
    void testDivisionByZero(){
        Calculator calculator = new Calculator();
        calculator.setFistNumber(10);
        calculator.setSecondNumber(0);
        assertEquals(0, calculator.Division());
    }
}
