package com.Calculator_UnitTests2.Calculator_UnitTests2;

import java.util.Scanner;

public class UserInterface {

    private Scanner scan;

    private Calculator calculator;

    public UserInterface(Scanner scan, Calculator calculator) {
        this.scan = scan;
        this.calculator = calculator;
    }

    public void start(){
        System.out.println("Input your option: \n" +
                "1-Addition.\n" +
                "2-Substraction.\n" +
                "3-Multiplication.\n" +
                "4-Division.\n" +
                "5-Exit.");
        Integer command = this.scan.nextInt();

        if (command == 1){
            System.out.println("The sum is: " + calculator.Addition());
        }
        else if (command == 2){
            System.out.println("Substraction is: " + calculator.Substraction());
        }
        else if (command == 3){
            System.out.println("Multiplication is: " + calculator.Multiplication());
        }
        else if (command == 4){
            calculator.Division();
            System.out.println("Division is: " + calculator.Division());
        }
        else if (command == 5){
            System.out.println("The wrong input. Please, try again");
        }
    }
}
