package repository;

import model.Vehicle;

import java.util.*;
import java.util.List;

public class VehicleRepository implements IVehicleRepository {
    private static List<Vehicle> vehicleList = new ArrayList<>();

    static {
        vehicleList.add(new Vehicle("67A-333.33", "xe máy", "xanh", "wave", "Đã rời đi"));
        vehicleList.add(new Vehicle("37K-555.56", "xe máy", "đen", "winer", "Được đỡ"));
        vehicleList.add(new Vehicle("51D-998.88", "ô tô", "đỏ", "toyota", "Đã rời đi"));

    }

    @Override
    public List<Vehicle> findAll() {
        //đọc file
        return vehicleList;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        //ghi file
        vehicleList.add(vehicle);
    }

    @Override
    public void removeVehicle(String licensePlate) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getLicensePlate().equals(licensePlate)) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    @Override
    public Vehicle findVehicleByLicensePlate(String licensePlate) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                return vehicle;
            }
        }
        return null;    }

}
