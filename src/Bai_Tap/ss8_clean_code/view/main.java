package Bai_Tap.ss8_clean_code.view;

import Bai_Tap.ss8_clean_code.controller.StudentController;

public class main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}
