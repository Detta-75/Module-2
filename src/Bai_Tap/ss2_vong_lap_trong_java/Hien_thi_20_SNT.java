package Bai_Tap.ss2_vong_lap_trong_java;

import java.util.Scanner;

public class Hien_thi_20_SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong can in ra: ");
        int num = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < num) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
