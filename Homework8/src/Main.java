public class Main {
    public static void main(String[] args) {
        // hints: Move all common attributes to the abstract class
        // hints: These exercises are similar to the inheritance ones.

        //1. Write a Java program to create an abstract class BankAccount with
        // abstract methods deposit() and withdraw().
        //Create subclasses: SavingsAccount and CurrentAccount
        // that extend the BankAccount class and implement the respective methods to
        // handle deposits and withdrawals for each account type.
        //For example, for SavingsAccount should not allow the user to withdraw
        // if the balance is less than 100.

        SavingsAccount savingsAccount =  new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingsAccount.withdraw();
        savingsAccount.deposit();

        currentAccount.withdraw();
        currentAccount.deposit();

        // 2. Write a Java program to create an abstract class Shape3D with abstract
        // methods calculateVolume() and calculateSurfaceArea().
        // Create subclasses Sphere and Cube that extend
        //the Shape3D class and implement the respective methods
        // to calculate the volume and surface area of each shape.

        Sphere sphere = new Sphere();
        Cube cube = new Cube();

        sphere.calculateSurfaceArea();
        sphere.calculateVolume();

        cube.calculateVolume();
        cube.calculateSurfaceArea();

        // 3. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter().
        //Create subclasses Triangle and Square that extend the GeometricShape class
        //and implement the respective methods to calculate the area and perimeter of each shape.

        Triangle triangle = new Triangle();
        Square square = new Square();

        triangle.area();
        triangle.perimeter();

        square.area();
        square.perimeter();

        // 4. Write a Java program to create an interface Shape with the getArea() method.
        //    Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
        //    Implement the getArea() method for each of the three classes.

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle1 triangle1 = new Triangle1();

        rectangle.getArea();
        circle.getArea();
        triangle1.getArea();

        // 5. Write a Java program to create an interface
        // Resizable with methods resizeWidth(int width) and resizeHeight(int height)
        // that allow an object to be resized.
        // Create a class Rectangle that implements the Resizable interface
        // and implements the resize methods.

        RectangleOne rectangleOne = new RectangleOne();

        rectangleOne.resizeHeight(100);
        rectangleOne.resizeWidth(50);

        // 6. Create an interface Movable with a method void move().
        // Create a class Car that implements both the Drawable and Movable interfaces.
        // Demonstrate how the class can use methods from both interfaces.

        Car car = new Car();
        car.draw();
        car.move();

        // 7. Define an interface Shape with methods double area() and double perimeter().
        // Create another interface Resizable with a method void resize(double factor).
        // Have a class Circle that implements both Shape and Resizable.
        // Write code to demonstrate how you can use methods from both interfaces.

        CircleOne circleOne = new CircleOne();

        circleOne.resize(2.00);
        circleOne.area();
        circleOne.perimeter();

        // 8. Define an interface Animal with a method void speak().
        // Create an interface Mammal that extends the Animal interface
        // and adds a method void walk(). Create a class Dog that implements the Mammal interface.
        // Demonstrate how you can use methods from both interfaces in the Dog class.

        Dog dog = new Dog();

        dog.speak();
        dog.walk();
    }
}