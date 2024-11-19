package Bai_Tap.ss17_io_binary_file_serialization.doc_va_ghi_danh_sach_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = ((List<Student>) ois.readObject());
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều ANh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Khánh Tùng", "Hà Nội"));
        writeDataToFile("studen.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("Student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
