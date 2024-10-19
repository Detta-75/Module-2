package model;

public class Vehicle {
    private String licensePlate, vehicleType, color, brand, status;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String vehicleType, String color, String brand, String status) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.color = color;
        this.brand = brand;
        this.status = status;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Biển số: " + licensePlate +
                ", loại xe: " + vehicleType +
                ", màu: " + color +
                ", hãng xe: " + brand +
                ", tình trạng: " + status;
    }
}
