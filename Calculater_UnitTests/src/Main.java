import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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