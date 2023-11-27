public class CircleOne implements ShapeOne, ResizableOne {
    @Override
    public void resize(double factor) {
        System.out.println("This is implementation resize method from ResizableOne interface");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
