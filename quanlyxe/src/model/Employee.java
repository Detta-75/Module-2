package model;

public class Employee extends User {
    private String id;
    private String shift;

    public Employee() {
    }

    public Employee(String name, String phoneNumber, String id, String shift) {
        super(name, phoneNumber);
        this.id = id;
        this.shift = shift;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", tên nhân viên: " + getName() +
                ", số điện thoại: " + getPhoneNumber() +
                ", ca trực: " + shift;
    }
}
