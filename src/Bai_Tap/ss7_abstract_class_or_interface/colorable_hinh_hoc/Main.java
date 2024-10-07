package Bai_Tap.ss7_abstract_class_or_interface.colorable_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        Geometric[] geometric = new Geometric[3];
        geometric[0] = new Circle();
        geometric[1] = new Rectangle();
        geometric[2] = new Square();

        for (Geometric geometrics: geometric) {
            if (geometrics instanceof Colorable) {
                System.out.println(((Colorable) geometrics).howToColer());
            }
        }
    }
}

