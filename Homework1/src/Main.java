import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Write a Java program to print 'Hello' on screen and your name on a separate line.

        System.out.println("Hello\n" + "Ecaterina");

        //2. Write a Java program to divide two numbers and print them on the screen.

        int a = 10;
        int b = 2;

        int result = a/b;

        System.out.println("Number " + a + " divided on " + b + " result " + result);

        //3. Write a Java program to print the results of the following operations.
        //Challenge: Try to guess the result before running the program, so you can observe the operators' precedence.

//        Test Data:
//        a. 8 * 9 - 5 / 4
        int c = 8;
        int d = 9;
        int e = 5;
        int f = 4;
        int result1 = c * d - e / f;
        System.out.println(result1);

//        b. (31 % 3) % 4

        int g = 31;
        int i = 3;

        int result2 = (g % i) % f;

        System.out.println(result2);

//        c. 31 % (3 % 4)

        int result3 = g % (i % f);

        System.out.println(result3);

//        d. 7 % 1 + 4 / 3 * 2 - 2 % 2

        int m = 7;
        int n = 1;
        int t = 2;

        int result4 = m % n + f / i * t - t % t;

        System.out.println(result4);

        //4. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        //5. Write a Java program that reads a number in inches and converts it to meters.

        Scanner input1 = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input1.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

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

        Scanner input2 = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input2.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = input2.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");

        //8. Write a Java program to take the user for a distance (in meters) and
        // the time taken (as three numbers: hours, minutes, seconds),
        // and display the speed, in meters per second, kilometers per hour
        // and miles per hour (hint: 1 mile = 1609 meters).

        float timeSeconds;
        float mps,kph, mph;

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        float hr = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float sec = scanner.nextFloat();

        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);


        scanner.close();
    }
}