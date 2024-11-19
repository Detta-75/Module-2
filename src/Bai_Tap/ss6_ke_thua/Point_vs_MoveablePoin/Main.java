package Bai_Tap.ss6_ke_thua.Point_vs_MoveablePoin;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.2f,2.3f);
        System.out.println(point);
        point.setXY(3.4f,4.5f);
        System.out.println("Updated " + point);
        MoveablePoint moveablePoint = new MoveablePoint(5.6f,6.7f,7.8f,8.9f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println("After: " + moveablePoint);
        moveablePoint.setSpeed(1.9f, 9.1f);
        moveablePoint.move();
        System.out.println("After anothe: " + moveablePoint);
    }
}
