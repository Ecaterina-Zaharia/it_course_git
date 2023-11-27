public class Rectangle extends Shape{

    int length;
    int width;

    @Override
    public void getArea() {
        int area = 0;
        area = length * width;
        System.out.println("The area of Rectangle with the length " + length + " and width "
                + width + " is " + area);

    }

    @Override
    public void getPerimeter() {
        int p = 0;
        p = (length + width) * 2;
        System.out.println("The Perimeter of Rectangle with the length " + length + " and width "
                + width + " is " + p);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
