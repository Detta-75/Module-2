package Bai_Tap.ss1_introduction_to_java;

import java.util.Scanner;

public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
