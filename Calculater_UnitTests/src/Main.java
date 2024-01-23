import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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