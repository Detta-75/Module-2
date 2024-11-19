package Bai_Tap.ss7_abstract_class_or_interface.resizeable_hinh_hoc;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[3];
        geometrics[0] = new Circle(2.0);
        geometrics[1] = new Rectangle(2.0,3.0);
        geometrics[2] = new Square(2.0);

        Random random = new Random();

        System.out.println("Pre-Area");
        for (Geometric geometric: geometrics) {
            System.out.println(geometric.getArea());
        }

        System.out.println("After-Area");
        for (Geometric geometric: geometrics) {
            double percent = 1 + random.nextInt(100);
            ((IResizeable) geometric).reSize(percent);
        }
        for (Geometric geometric: geometrics) {
            System.out.println(geometric.getArea());
        }
    }
}
