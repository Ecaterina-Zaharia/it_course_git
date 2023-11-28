import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Write a Java program to print 'Hello' on screen and your name on a separate line.

        System.out.println("Hello\n" + "Ecaterina");

        //2. Write a Java program to divide two numbers and print them on the screen.

        //3. Write a Java program to print the results of the following operations.
        //Challenge: Try to guess the result before running the program, so you can observe the operators' precedence.

//        Test Data:
//        a. 8 * 9 - 5 / 4
//        b. (31 % 3) % 4
//        c. 31 % (3 % 4)
//        d. 7 % 1 + 4 / 3 * 2 - 2 % 2

        //4. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

        //5. Write a Java program that reads a number in inches and converts it to meters.

        //6. Write a Java program that reads a number and displays the square, cube, and fourth power.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        String userInput = scanner.nextLine();
        int value = Integer.valueOf(userInput);

        System.out.println("the square of number is: " + value * value);
        System.out.println("the cube of number is: " + value * value * value);
        System.out.println("the fourth power of number is " + value * value * value * value);

// EXTRA
        //7. Write a Java program to compute the body mass index (BMI).

        //8. Write a Java program to take the user for a distance (in meters) and
        // the time taken (as three numbers: hours, minutes, seconds),
        // and display the speed, in meters per second, kilometers per hour
        // and miles per hour (hint: 1 mile = 1609 meters).
    }
}