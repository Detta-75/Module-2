package Bai_Tap.ss3_array;

import java.util.Scanner;

public class Xoa_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 8,};
        int N = arr.length;
        System.out.println("Nhap so phan tu can xoa: ");
        int x = sc.nextInt();
        int index_del = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            N--;
        }

        if (index_del != -1) {
            System.out.println("Mang sau khi xoa: ");
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i] + "");
            }
        } else {
            System.out.println("Khong toan tai trong mang");
        }
        sc.close();
    }
}
