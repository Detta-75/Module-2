package repository;

import model.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    List<Vehicle> findAll();

    void addVehicle(Vehicle vehicle);

    void removeVehicle(String licensePlate);

    Vehicle findVehicleByLicensePlate(String licensePlate);
}
