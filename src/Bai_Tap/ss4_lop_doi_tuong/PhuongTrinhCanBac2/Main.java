package Bai_Tap.ss4_lop_doi_tuong.PhuongTrinhCanBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap so c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem: x1 = " + equation.getRoot1() + " x2 = " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem: x = " + equation.getRoot2());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
        sc.close();
    }
}
