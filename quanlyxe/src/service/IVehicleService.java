package service;

import model.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> findAll();

    void addVehicle(Vehicle vehicle);

    void deleteVehicle(String licensePlate);


    void updateVehicle(Vehicle vehicle);

    Vehicle findByLicensePlate(String licensePlate);

}
