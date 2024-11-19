package Bai_Tap.ss5_access_modifier.Xay_dung_lop_chi_ghi;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Ban đầu: ");
        student.putOut();
//        student.setName("Dat");
//        student.setClass("C08");
        System.out.println("Sau khi thay đổi: ");
        student.putOut();
    }
}
