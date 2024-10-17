package Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.repository;

import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void add(Student student);
    void deleteById(int id);
}
