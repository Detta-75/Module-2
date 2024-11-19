package Bai_Tap.ss5_access_modifier.Lyuen_tap_Access_modifier;

public class Luyen_tap_su_dung {
    private double radius = 1.0;
    private String color = "red";

    public Luyen_tap_su_dung() {
    }

    public Luyen_tap_su_dung(double radius) {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
