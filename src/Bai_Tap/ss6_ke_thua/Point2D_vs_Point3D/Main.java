package Bai_Tap.ss6_ke_thua.Point2D_vs_Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.2f, 2.3f);
        System.out.println(point2D);
        point2D.setXY(3.4f, 4.5f);
        System.out.println("Sau khi cap nhat: " + point2D);
        Point3D point3D = new Point3D(9.8f, 8.7f, 7.6f);
        System.out.println(point3D);
        point3D.setXYZ(6.5f, 5.4f, 4.3f);
        System.out.println("Sau khi cap nhat: " + point3D);
    }
}
