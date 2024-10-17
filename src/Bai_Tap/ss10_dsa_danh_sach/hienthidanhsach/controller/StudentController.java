package Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.controller;

import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.model.Student;
import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    StudentService studentService = new StudentService();
    Scanner scanner = new Scanner(System.in);
    public void listMenu() {
        System.out.println("1. Hien thi danh sach");
        System.out.println("2. Them vao danh sach");
        System.out.println("3. Xoa");
        System.out.println("0. Thoat");
    }
    public void showMenu() {
        int i;
        do {
            listMenu();
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    List<Student> studentList = studentService.getAll();
                    display(studentList);
                    break;
                case 2:
                    Student newStudent = inputStudent();
                    studentService.add(newStudent);
                    System.out.println("Them thanh cong");
                    break;
                case 3:
                    System.out.println("Nhap id can xoa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    studentService.deleteById(id);
                    System.out.println("Xoa thanh cong");
                    break;
            }
        } while (i != 0);
    }
    public void display(List<Student> studentList) {
        if (!studentList.isEmpty()) {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i));
            }
        } else {
            System.out.println("Khong co hoc sinh nay");
        }
    }
    public Student inputStudent() {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        Student newStudent = new Student(name,id);
        return newStudent;
    }
}
