package Bai_Tap.ss5_access_modifier.Lyuen_tap_Access_modifier;

public class Luyen_tap_su_dung {
    private double radius;
    private String color;
    public Luyen_tap_su_dung() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Luyen_tap_su_dung(double radius) {
        this.radius = 1.0;
        this.color = "red";
    }

    private double getRadius() {
        return radius;
    }

    private double getArea() {
        return Math.PI * radius * radius;
    }
    public void input() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
    }
}
