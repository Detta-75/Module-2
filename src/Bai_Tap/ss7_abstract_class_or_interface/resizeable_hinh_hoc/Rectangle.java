package Bai_Tap.ss7_abstract_class_or_interface.resizeable_hinh_hoc;

public class Rectangle extends Geometric implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width * length) * 2;
    }

    @Override
    public void reSize(double precent) {
        setWidth(getWidth() * (1 - precent / 100));
        setLength(getLength() * (1 - precent / 100));
    }
}
