package Bai_Tap.ss5_access_modifier.Lyuen_tap_Access_modifier;

public class main {
    public static void main(String[] args) {
        Luyen_tap_su_dung suDung = new Luyen_tap_su_dung();
        System.out.println("1");
        System.out.println("Radius: " + suDung.getRadius());
        System.out.println("Area: " + suDung.getArea());
        Luyen_tap_su_dung suDung1 = new Luyen_tap_su_dung(2.5);
        System.out.println("\n2");
        System.out.println("Radius: " + suDung1.getRadius());
        System.out.println("Area: " + suDung1.getArea());
    }
}
