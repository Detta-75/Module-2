package repository;

import model.Vehicle;
import saveData.ReadAndWriteVehicle;

import java.util.*;
import java.util.List;

public class VehicleRepository implements IVehicleRepository {
    private static List<Vehicle> vehicleList = new ArrayList<>();
    ReadAndWriteVehicle readAndWriteVehicle = new ReadAndWriteVehicle();

    static {
        vehicleList.add(new Vehicle("Nguyễn Văn A","0934567888","67A-333.33","Đã rời đi"));
        vehicleList.add(new Vehicle("Lê Văn B","0388607777","37K-555.56","Được đỗ"));
        vehicleList.add(new Vehicle("Trần Văn C","0818024444","51D-998.88","Đã rời đi"));

    }

    @Override
    public List<Vehicle> findAll() {
        //đọc file
        readAndWriteVehicle.ReadData();
        return vehicleList;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        //ghi file
        readAndWriteVehicle.WriteData(vehicleList);
        vehicleList.add(vehicle);
    }

    @Override
    public void deleteVehicle(String licensePlate) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getLicensePlate().equals(licensePlate)) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getLicensePlate().equalsIgnoreCase(vehicle.getLicensePlate())){
                vehicleList.set(i,vehicle);
                break;
            }
        }
    }

    @Override
    public Vehicle findByLicensePlate(String licensePlate) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                return vehicle;
            }
        }
        return null;
    }



}
