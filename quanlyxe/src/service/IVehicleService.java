package service;

import model.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> findAll();

    void addVehicle(Vehicle vehicle);

    void removeVehicle(String licensePlate);

    Vehicle findVehicleByLicensePlate(String licensePlate);


}
