import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                // use the 'private' access modifier and rely on getters/setters to retrieve/alter the object's data
                // try to use multiple types of constructors and set the field's data in different manners (constructor or setter)
                // use debugger to identify the changes

        //1. A class called Employee, which models an employee with an ID, name and salary.
        // The method raiseSalary(percent) increases the salary by the given percentage.
        // Write the Employee class.

        Employee employee = new Employee(12, "John Smith", 20,20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide the salary amount: ");
        employee.setEmployeeSalary(scanner.nextDouble());

        System.out.println("What percent raise will you give to him/her? ");
        employee.setRaisePercent(scanner.nextDouble());

        System.out.println("The final amount of salary is " + employee.raiseSalary());

        System.out.println();

        //2. A class called InvoiceItem, which models an item of an invoice,
        // with ID, description, quantity and unit price.
        // Write the InvoiceItem class.
        // This class should contain a method called getTotal() based on quantity and price.

        InvoiceItem invoiceItem = new InvoiceItem(1, "Book Gone with the Wind", 1, 12);
        System.out.println("The price per 1 item " + invoiceItem.getDescription() + " is " + invoiceItem.getPrice() + " $. Please, provide the quantity of items: ");
        invoiceItem.setQuantity(scanner.nextInt());

        System.out.println("The final price for " + invoiceItem.getQuantity() + " " + invoiceItem.getDescription() + " is " +  invoiceItem.getTotal() + " $");

        System.out.println();

       //3. A class called Date, which models a calendar date.
       // Write the Date class.
       // This class must contain a field for day, one for month and one for year.
       // This class must contain a method to print the date with this template "day/month/year".

        Date date = new Date(07, 10, 1994);
        System.out.println("Please, type a day in format __");
        date.setDay(scanner.nextInt());

        System.out.println("Please, type a month in format __");
        date.setMonth(scanner.nextInt());

        System.out.println("Please, type an year in format ____");
        date.setYear(scanner.nextInt());

        date.printDate();

        //4. A class called Account, which models a bank account of a customer.
        // The methods credit(amount) and debit(amount) add or subtract the given
        // amount to the balance.
        // The method transferTo(anotherAccount, amount) transfers
        // the given amount from this Account to the given anotherAccount.
         // Write the Account class.
    }
}