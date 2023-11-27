public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double area = 0;
        double p = 3.14;
        area = p * (radius * radius);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        double p = 3.14;
        perimeter = 2 * p * radius;
        return perimeter;
    }
}
