package Bai_Tap.ss8_clean_code.service;

import Bai_Tap.ss8_clean_code.model.Student;
import Bai_Tap.ss8_clean_code.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements IStudenService {
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
