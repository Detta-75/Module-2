package Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.view;

import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}
