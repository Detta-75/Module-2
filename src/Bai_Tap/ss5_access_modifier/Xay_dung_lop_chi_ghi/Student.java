package Bai_Tap.ss5_access_modifier.Xay_dung_lop_chi_ghi;

public class Student {
    private String name = "John";
    private String aClass = "C02";

    public Student() {
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public void putOut() {
        System.out.println("Name: " + name + "\tClass: " + aClass);
    }
}
