package Bai_Tap.ss8_clean_code.service;

import Bai_Tap.ss8_clean_code.model.Student;

import java.util.List;

public interface IStudenService {
    List<Student> getAll();
    void add(Student student);
    void deleteById(int id);
}
