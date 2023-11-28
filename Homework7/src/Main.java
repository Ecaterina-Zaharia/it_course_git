public class Main {
    public static void main(String[] args) {

        // 1. Write a Java program to create a class called Rectangle with private instance variables length and width.
        // Provide public getter and setter methods to access and modify these variables.

        Rectangle rectangle = new Rectangle();


        rectangle.setWidth(4);
        rectangle.setLength(8);

        System.out.println("The rectangle width is " + rectangle.getWidth()
                + " and the rectangle length is " +  rectangle.getLength());

        // 2. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
        //    you can use Math.PI for the area and perimeter.

        Circle circle = new Circle();

        circle.setRadius(12);

        System.out.println("If the Circle radius is " + circle.getRadius()
                + " then the Aria is " + circle.calculateArea()
                + " and the Perimeter is " + circle.calculatePerimeter());

        //3. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Dog that overrides the makeSound() method to bark.
        //   Animal can print "animal makes sound"
        //   Dog can print "barking..."

        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println("The " + animal.makeSound() + " but the Dog is " + dog.makeSound());

        // 4. Write a Java program to create a class called Vehicle with a method called drive().
        // Create a subclass called Car that overrides the drive() method to print "Driving a car".

        Car car = new Car();

        System.out.println("The class Car with method drive prints " + car.drive());

        // 5. Write a Java program to create a class known as "BankAccount"
        // with methods called deposit() and withdraw().
        // Create a subclass called SavingsAccount that
        // overrides the withdraw() method to prevent withdrawals
        // if the account balance falls below one hundred.

        BankAccount bankAccount = new BankAccount(500);
        SavingsAccount savingsAccount = new SavingsAccount(500);
        bankAccount.deposit(1000);
        System.out.println("New balance after depositing 1000$ is: " + bankAccount.getUserBalance());

        savingsAccount.withdraw(1450);
        System.out.println("New balance after withdraw 1450$ is: " + savingsAccount.getUserBalance());

        // 6. Write a Java program to create a vehicle class hierarchy.
        // The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
        // Each subclass should have properties such as make, model, year, and fuel type.
        // Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        CarOne carone = new CarOne("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + carone.getModel());
        System.out.println("Fuel Efficiency: " + carone.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + carone.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + carone.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");

        // 7. Write a Java program to create a class known as Person
        // with methods called getFirstName() and getLastName().
        // Create a subclass called Employee that adds a new method
        // named getEmployeeId() and overrides the getLastName() method
        // to include the employee's job title.

        Person person = new Person();
        Employee employee = new Employee();

        person.getFirstName();
        person.getLastName();
        employee.getEmployeeId();
        employee.getLastName();

        // 8. Design a class hierarchy for geometric shapes.
        // Create a base class Shape with methods to calculate area and perimeter.
        // Then, create subclasses for specific shapes like Circle, Rectangle, and Triangle.
        // Override the area and perimeter calculation methods for each shape.

    }
}