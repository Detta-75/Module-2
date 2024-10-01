package Bai_Tap.ss2_vong_lap_trong_java;

public class Hien_thi {
    public static void chuNhat() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void tamGiac() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void tamGiacNguoc() {
        for (int i = 6; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        chuNhat();
        System.out.println();
        tamGiac();
        System.out.println();
        tamGiacNguoc();
    }
}
