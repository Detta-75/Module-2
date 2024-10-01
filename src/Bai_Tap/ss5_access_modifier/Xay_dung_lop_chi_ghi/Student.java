package Bai_Tap.ss5_access_modifier.Xay_dung_lop_chi_ghi;

public class Student {
    private String name = "John";
    private String Class = "C02";

    public Student() {
    }

    private void setClass(String aClass) {
        Class = aClass;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void putout() {
        System.out.println("Name: " + this.name + " Class: " + this.Class);
    }
}
