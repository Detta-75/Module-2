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
    public void deleteVehicle(String licensePlate) {
        vehicleRepository.deleteVehicle(licensePlate);
    }


    @Override
    public void updateVehicle(Vehicle vehicle) {
        vehicleRepository.updateVehicle(vehicle);
    }

    @Override
    public Vehicle findByLicensePlate(String licensePlate) {
        return vehicleRepository.findByLicensePlate(licensePlate);
    }

}
