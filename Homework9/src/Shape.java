public abstract class Shape {

    protected String color;
    protected Boolean filled;

    public abstract void getArea();

    public abstract void getPerimeter();

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
}
