public class Car implements Movable, Drawable {


    @Override
    public void move() {
        System.out.println("This is implementation move method from Movable interface");
    }

    @Override
    public void draw() {
        System.out.println("This is implementation draw method from Drawable interface");
    }
}
