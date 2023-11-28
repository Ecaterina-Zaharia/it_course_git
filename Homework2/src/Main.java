import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        // 1. Take the values of length and breadth of a rectangle from the user
        // and check if it is square or not.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the the value of length: ");
        int length = scanner.nextInt();

        System.out.println("Please, enter the value of breadth: ");
        int breadth = scanner.nextInt();

        if (length == breadth){
            System.out.println("Your rectangle is the square");
        }
        else {
            System.out.println("Your rectangle is NOT the square");
        }

        // 2. Write a Java program to check whether a given number is even or odd.

        Scanner reader = new Scanner(System.in);
        System.out.println("Please, type a number: ");

        int number = Integer.valueOf(reader.nextLine());

        if (number%2 == 0){
            System.out.println("The number " + number + " is even");
        }
        else {
            System.out.println("The number " + number + " is odd");
        }

        //3. Write a Java program to read the age of a candidate
        // and determine whether he is eligible to cast his/her own vote.

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please, type your age: ");
        int age = scanner2.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to cast your vote");
        }
        else {
            System.out.println("You are NOT eligible");
        }

        //4. Write a Java program to read the value of an integer m and display
        // the value of n is 1 when m is larger than 0, 0 when m is 0 and -1
        // when m is less than 0.

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Please, enter a number value for m: ");
        int m = scanner3.nextInt();

        if (m > 0){
            System.out.println("The value of n is 1");
        }
        else if (m == 0){
            System.out.println("The value of n is 0");
        }
        else if (m < 0 ){
            System.out.println("The value of n is -1");
        }

        //5. Write a Java program to accept the height of a person
        // in centimeters and categorize the person according to their height.

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Please, type your height in cm: ");

        int height = Integer.valueOf(reader3.nextLine());

        if (height > 0 && height <= 140){
            System.out.println("Your height is short");
        }
        else if (height > 140 && height <= 170){
            System.out.println("Your height is average");
        }
        else if (height > 170) {
            System.out.println("Your height is tall");
        }
        else {
            System.out.println("The input is not valid");
        }

        //6. Write a Java program to check whether a triangle is Equilateral, Isosceles or Scalene.

        Scanner reader4 = new Scanner(System.in);
        System.out.println("Please, type the length for side 1: ");
        int l1 = Integer.valueOf(reader4.nextLine());

        System.out.println("Please, type the length for side 2: ");
        int l2 = Integer.valueOf(reader4.nextLine());

        System.out.println("Please, type the length for side 3: ");
        int l3 = Integer.valueOf(reader4.nextLine());

        if (l1 == l2 && l2 == l3 && l3 == l1){
            System.out.println("The triangle is Equilateral");
        }
        else if (l1 != l2 && l2 != l3 && l3 != l1) {
            System.out.println("The triangle is Scalene");
        }
        else {
            System.out.println("The triangle is Isosceles");
        }

        // 7. Write a Java program to check whether a triangle can be formed with the given values for the angles.

        Scanner reader5 = new Scanner(System.in);
        System.out.println("Please, type the value of the angle 1: ");
        int angle1 = Integer.valueOf(reader5.nextLine());

        System.out.println("Please, type the value of the angle 2: ");
        int angle2 = Integer.valueOf(reader5.nextLine());

        System.out.println("Please, type the value of the angle 3: ");
        int angle3 = Integer.valueOf(reader5.nextLine());

        int sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            System.out.println("The triangle can be formed with the given values for the angles");
        }
        else {
            System.out.println("The triangle cannot be formed");
        }

        // 7. A shop will give a discount of 10% if the cost of purchased quantity is more than 1000.
        //   Ask user for quantity
        //   Suppose, one unit will cost 100.
        //   Judge and print total cost for user.

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Please, type the quantity: ");
        int quantity = Integer.valueOf(reader1.nextLine());

        int cost = 100;
        int totalSum = quantity * cost;

        if (totalSum > 1000) {
            int sumWithDiscount = totalSum - (totalSum / 100 * 10);
            System.out.println("You have discount 10% and your total cost is " + sumWithDiscount);
        }
        else {
            System.out.println("You do not have any discount. Your total cost is " + totalSum);
        }

        //8. Write a program to check whether an entered character is lowercase (a to z) or uppercase (A to Z).
        //   hint: use char ch = scanner.next().charAt(0); in order to read a char using Scanner.
        //   hint: Use ASCII Codes Table to identify the lowercase and uppercase characters.

        Scanner reader7 = new Scanner(System.in);
        System.out.println("Provide a letter: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is a lowercase character");
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is an uppercase character");
        } else {
            System.out.println(ch + " is not a letter.");
        }

        // 9. Write a Java program to check whether a character is an alphabet, digit or special character.
        //    hint: use ASCII Codes Table to identify the letters.

        System.out.println("Enter a character: ");
        char ch1 = scanner.next().charAt(0);

        if((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')){
            System.out.println(ch1 + " is a letter from alphabet");
        } else if(ch1 >= '0' && ch1 <= '9'){
            System.out.println(ch1 + " is a number");
        } else {
            System.out.println(ch + " is a special character.");
        }

        // 10. Write a Java program to read any day number in integer and display the day name in word format.

        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        daysList.add("Sunday");

        Scanner reader6 = new Scanner(System.in);
        System.out.println("Please, type the day number: ");
        int dayNumber = Integer.valueOf(reader6.nextLine());

        if (dayNumber > 0 && dayNumber <= 7){
            System.out.println(daysList.get(dayNumber - 1));
        }
        else {
            System.out.println("The value is not valid. Please, try agan.");
        }

        // 11. Write a program in Java to read any digit and display it in the word.
        //     hint: input is 1 then the answer should be One.

        System.out.println("Enter a digit: ");
        int digit = scanner.nextInt();

        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid digit");
                break;

        }

        // 12. Write a program in Java which is a Menu-Driven Program to perform
        // a simple calculation.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the first Integer: ");
        int i1 = scanner1.nextInt();

        System.out.println("Enter the second Integer: ");
        int i2 = scanner1.nextInt();

        System.out.println("Input your option: \n" +
                "1-Addition.\n" +
                "2-Substraction.\n" +
                "3-Multiplication.\n" +
                "4-Division.\n" +
                "5-Exit.");
        int option = scanner1.nextInt();

        if (option == 1){
            System.out.println("The Addition of " + i1 + " and " + i2 + " is: " + (i1 + i2));
        }
        else if (option == 2){
            System.out.println("The Substraction of " + i1 + " and " + i2 + " is: " + (i1 - i2));
        }
        else if (option == 3){
            System.out.println("The Multiplication of " + i1 + " and " + i2 + " is: " + (i1 * i2));
        }
        else if (option == 4){
            System.out.println("The Division of " + i1 + " and " + i2 + " is: " + (i1 / i2));
        }
        else if (option == 5) {
            System.out.println("Exit");
        }
        else {
            System.out.println("The wrong input. Please, try again");
        }
    }
}