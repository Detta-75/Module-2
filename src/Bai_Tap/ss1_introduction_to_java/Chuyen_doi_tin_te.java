package Bai_Tap.ss1_introduction_to_java;

import java.util.Scanner;

public class Chuyen_doi_tin_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usd;
        System.out.print("Mời nhập số tiền USD: ");
        usd = sc.nextInt();
        int VND = usd * 23000;
        System.out.print("Số tiền đổi ra tiền VND: " + VND);
    }
}
