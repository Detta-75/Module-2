package Bai_Tap.ss6_ke_thua.Circle_va_Cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "red");
        System.out.println(circle);
        System.out.println("Dien tich hinh tron: " + circle.getArea());
        Cylinder cylinder = new Cylinder(2.5,"bule",4);
        System.out.println(cylinder);
        System.out.println("The tich hinh tron la: " + cylinder.getVolume());
    }
}
