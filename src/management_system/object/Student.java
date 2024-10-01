package management_system.object;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name,email,nameClass;
    private LocalDate birthday;

    public Student(int id, String name, String email, String nameClass, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.nameClass = nameClass;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
