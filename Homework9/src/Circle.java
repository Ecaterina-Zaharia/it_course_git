public class Circle extends Shape{

    double r;
    double pi = 3.14;

    @Override
    public void getArea() {
        double area = 0;
        area = pi * (r*r);
        System.out.println("The area of Circle with the radius " + r + " is " + area);

    }

    @Override
    public void getPerimeter() {
        double p = 0;
        p = 2 * pi * r;
        System.out.println("The Perimeter of Circle with the radius " + r + " is " + p);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
