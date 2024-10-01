package Bai_Tap.ss3_array;

import java.util.Scanner;

public class Them_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 6, 7, 8};
        int n = arr.length;
        System.out.println("Mang ban dau: ");
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();

        System.out.println("So can chen: ");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri chen: ");
        int index = sc.nextInt();

        if (index < 0 || index > arr.length - 1) {
            System.out.println("Khong the chen phan tu vao mang.");
        } else {
            int[] newArr = new int[n + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = x;

            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }

            System.out.println("Mang sau khi chen: ");
            for (int i : newArr) {
                System.out.println(i + " ");
            }
        }
    }
}
