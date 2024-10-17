package Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.repository;

import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student("Dat", 1));
        studentList.add(new Student("Nam", 2));
    }
    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
            }
        }
    }
}
