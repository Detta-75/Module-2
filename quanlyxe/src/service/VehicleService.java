package service;

import model.Vehicle;
import repository.IVehicleRepository;
import repository.VehicleRepository;

import java.util.List;

public class VehicleService implements IVehicleService {
    private IVehicleRepository vehicleRepository = new VehicleRepository();

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.addVehicle(vehicle);
    }

    @Override
    public void removeVehicle(String licensePlate) {
        vehicleRepository.removeVehicle(licensePlate);
    }

    @Override
    public Vehicle findVehicleByLicensePlate(String licensePlate) {
        return vehicleRepository.findVehicleByLicensePlate(licensePlate);
    }

}
