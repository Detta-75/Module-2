package Bai_Tap.ss7_abstract_class_or_interface.colorable_hinh_hoc;

public class Square extends Rectangle implements IColorable {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    @Override
    public String toString() {
        return "Square{side= " + getWidth() + "}";
    }

    @Override
    public String howToColer() {
        return "Coler all four side...";
    }
}
