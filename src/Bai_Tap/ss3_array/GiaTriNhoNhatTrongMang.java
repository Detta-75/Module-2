package Bai_Tap.ss3_array;

import java.util.Scanner;

public class GiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhap cac phan tu :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            arr[i] =scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la: " +min);
    }
}
