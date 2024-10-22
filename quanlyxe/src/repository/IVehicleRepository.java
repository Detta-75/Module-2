package repository;

import model.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    List<Vehicle> findAll();

    void addVehicle(Vehicle vehicle);

    void deleteVehicle(String licensePlate);


    void updateVehicle(Vehicle vehicle);

    Vehicle findByLicensePlate(String licensePlate);
}

