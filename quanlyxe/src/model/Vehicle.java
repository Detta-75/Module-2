package model;

public class Vehicle extends User {
    private String licensePlate, status;

    public Vehicle() {
    }

    public Vehicle(String name, String phoneNumber, String licensePlate, String status) {
        super(name, phoneNumber);
        this.licensePlate = licensePlate;
        this.status = status;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", biển số: " + licensePlate +
                ", tình trạng: " + status + ".";
    }
}
