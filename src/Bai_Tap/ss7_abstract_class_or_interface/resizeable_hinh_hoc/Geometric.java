package Bai_Tap.ss7_abstract_class_or_interface.resizeable_hinh_hoc;

public abstract class Geometric implements IResizeable {
    public Geometric() {
    }

    @Override
    public abstract String toString();

    public abstract double getArea();

    public abstract double getPerimeter();
}
