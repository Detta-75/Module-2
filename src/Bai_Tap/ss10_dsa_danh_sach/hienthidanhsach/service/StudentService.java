package Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.service;

import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.model.Student;
import Bai_Tap.ss10_dsa_danh_sach.hienthidanhsach.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
