package Bai_Tap.ss14_thuat_toan_sap_xep.minh_hoa_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do dai mang: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhap" + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mang xuat: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
    }
}
