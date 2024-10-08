package Bai_Tap.ss4_lop_doi_tuong.PhuongTrinhCanBac2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()) / (2 * a));
    }
}
