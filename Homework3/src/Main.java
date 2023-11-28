import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //1. Write a program to print numbers from 1 to 10.
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("----------------");

        // 2. Write a program to calculate the sum of first 10 natural number.
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("The sum of first 10 natural numbers is: " + sum);
        System.out.println("----------------");

        // 3. Write a program to find the factorial value of any number entered through the keyboard.
        Scanner reader = new Scanner(System.in);
        System.out.println("Please, type a number: ");

        int number = Integer.valueOf(reader.nextLine());
        int factorial = 1;
        for (int i = number; i >= 1; i--){
            factorial = factorial * i;
        }

        System.out.println("!" + number + " = " +  factorial);
        System.out.println("----------------");

        // 4. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int userNumber;
        char choice;
        int even = 0;
        int odd = 0;

        do
        {
            System.out.println("Please, type a number: ");
            userNumber = reader.nextInt();


            if(userNumber %2 == 0){
                even +=userNumber;
            }
            else {
                odd += userNumber;
            }
            System.out.println("Do you want to continue y/n?");
            choice = reader.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
        System.out.println("----------------");

        // 5. Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.

        Scanner reader = new Scanner(System.in);
        System.out.println("Please, type a number: ");

        int userNumber = reader.nextInt();

        for (int i = 0; i < 10; i++){
            System.out.println(userNumber + " x " + (i + 1) + " = " + (userNumber * (i+1)));
        }
        System.out.println("----------------");

        //6. Two numbers are entered through the keyboard.
        // Write a program to find the value of one number raised to the power of another.

        long result = 1;
        System.out.println("Provide the 1s number: ");
        int firstNumber = reader.nextInt();

        System.out.println("Provide the 2d number: ");
        int secondNumber = reader.nextInt();

        while (secondNumber != 0){
            result = result * firstNumber;
            --secondNumber;
        }
        System.out.println("The " + firstNumber + " raised to the power of " + secondNumber + " is " + result);
        System.out.println("-------------------");

        // 7. Write a program to display a pattern like a right angle triangle with a number.

        int i;
        int j;

        System.out.println("Please, provide the number of rows: ");
        int numberRows = reader.nextInt();

        for(i = 1; i <= numberRows; i++){
            for (j = 1; j <= i; j++)
                System.out.println(j);
            System.out.println("");
        }

        System.out.println("---------------");

        // 8. Write a program that prints the product of the first n odd natural numbers.
        int sum1 = 0;
        System.out.println("Enter the value of n: ");
        int n = reader.nextInt();

        for (int l = 1; l <= n*2; l+=2){
            sum1 += l;
        }
        System.out.println("The sum of the first " + n + " odd number is: " + sum1);
        System.out.println("----------------");

        // 9. Write a program to make such a pattern like a right angle triangle
        // with a number which will repeat a number in a row.

        int i1;
        int j1;

        System.out.println("Input number of n : ");

        int numberRows1 = reader.nextInt();

        for (i1 = 1; i1 <= numberRows1; i1++){
            for (j1 = 1; j1 <= i1; j1++)
                System.out.println(i1);
            System.out.println("");
        }
        System.out.println("---------------------");

        // 10. Write a program that displays the first n square numbers and their sum.
        int sum3 = 0;

        System.out.println("Please, provide the value of n: ");
        int numberUser3 = reader.nextInt();

        for (int i3 = 1; i3 <= numberUser3; i3++){
            sum3 += (i3 * i3);

            System.out.println((i3 * i3) + " = " + sum3);
        }
        System.out.println("----------------");
        //11. Write a program to check whether a given number is a 'Perfect' number or not.
        //The sum of its divisors is equal to the number itself excluding the number.

        int sum4 = 0;
        int i4 = 1;
        System.out.println("Enter the number: ");
        int userNumber4 = reader.nextInt();

        while (i4 <= userNumber4/2){
            if (userNumber4 % i4 == 0){
                sum4 = sum4 + i4;
            }
            i4++;
        }
        if (sum4 == userNumber4){
            System.out.println(userNumber4 + " is a perfect number.");
        } else System.out.println(userNumber4 + " is not a perfect number.");

        System.out.println("------------------------");

        //12. Write a program to find the 'Perfect' numbers within a given number of ranges.

        Scanner reader = new Scanner(System.in);
        System.out.println("Please, type the starting number: ");
        int starting_number = Integer.valueOf(reader.nextLine());

        System.out.println("Please, type the ending number: ");
        int ending_number = Integer.valueOf(reader.nextLine());

        System.out.println("Perfect Numbers between "+starting_number+ " and "+ ending_number);
        for (int i = starting_number; i <= ending_number; i++){
            if(isPerfectNumber(i)){
                System.out.println(i+" is a perfect number");
            }
        }

        public static boolean isPerfectNumber(int number){
            int sum = 0;
            for(int i=1; i<=number/2; i++){
                if(number%i == 0){
                    sum +=i;
                }
            }
            if(sum==number){
                return true;
            } else{
                return false;
            }
        }

        //13. Write a program to print Fibonacci series of n terms where n is input by user:
        //Example:
        //0 1 1 2 3 5 8 13 24 .....

        int firstTerm = 0;
        int secondTerm = 1;

        Scanner reader = new Scanner(System.in);
        System.out.println("Please, type the value for n: ");
        int n = Integer.valueOf(reader.nextLine());

        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
