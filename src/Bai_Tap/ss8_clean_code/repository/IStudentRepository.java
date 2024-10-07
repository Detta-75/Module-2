package Bai_Tap.ss8_clean_code.repository;

import Bai_Tap.ss8_clean_code.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void add(Student student);
    void deleteById(int id);
}
