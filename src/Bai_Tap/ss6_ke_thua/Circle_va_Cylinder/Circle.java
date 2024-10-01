package Bai_Tap.ss6_ke_thua.Circle_va_Cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: Radius= " + radius + ", Color= " + color;
    }
}
