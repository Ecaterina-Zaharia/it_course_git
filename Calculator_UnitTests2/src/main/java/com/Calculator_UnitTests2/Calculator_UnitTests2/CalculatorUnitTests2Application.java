package com.Calculator_UnitTests2.Calculator_UnitTests2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorUnitTests2Application {

	public static void main(String[] args) {

		SpringApplication.run(CalculatorUnitTests2Application.class, args);


		Scanner scanner1 = new Scanner(System.in);

		Calculator calculator = new Calculator();

		UserInterface userInterface = new UserInterface(scanner1, calculator);

		System.out.println("Enter the first Integer: ");
		int i1 = scanner1.nextInt();
		calculator.setFistNumber(i1);

		System.out.println("Enter the second Integer: ");
		int i2 = scanner1.nextInt();
		calculator.setSecondNumber(i2);

		userInterface.start();

	}

}
