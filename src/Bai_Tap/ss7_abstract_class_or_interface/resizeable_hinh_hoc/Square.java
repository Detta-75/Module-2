package Bai_Tap.ss7_abstract_class_or_interface.resizeable_hinh_hoc;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }

    @Override
    public String toString() {
        return "Square{side= " + getWidth() + " }";
    }
}
