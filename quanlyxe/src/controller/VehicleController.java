package controller;

import Input.Input;
import model.Vehicle;
import service.IVehicleService;
import service.VehicleService;

import java.util.List;
import java.util.Scanner;

public class VehicleController {
    private IVehicleService vehicleService = new VehicleService();
    private Scanner scanner = new Scanner(System.in);
    private Input input = new Input();

    private String inputStatus() {
        String stautus;
        while (true) {
            System.out.println("Nhập tình trạng xe (Được đỗ/ Đã rời đi)");
            stautus = scanner.nextLine();
            stautus = input.capitalizeFirstLetter(stautus);
            if (stautus.equalsIgnoreCase("được đỗ") || stautus.equalsIgnoreCase("Đã rời đi")) {
                return stautus;
            } else {
                System.out.println("Không hợp lệ nhập lại");
            }
        }
    }

    public void display() {
        List<Vehicle> vehicleList = vehicleService.findAll();
        System.out.println("Danh sách xe trên hệ thống: ");
        for (int j = 0; j < vehicleList.size(); j++) {
            System.out.println(vehicleList.get(j));
        }
    }

    public Vehicle inputDataVehicle() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        name = input.capitalizeFirstLetter(name);

        String phoneNumber;
        while (true) {
            System.out.println("Nhập số điện thoại: ");
            phoneNumber = scanner.nextLine();
            if (input.checkPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.println("Số điện thoại nhập sai vui lòng nhập lại");
            }
        }

        System.out.println("Biển số xe: ");
        String licensePlate = scanner.nextLine();
        while (true) {

            licensePlate = scanner.nextLine();
            if (input.checkLicensePlate(licensePlate)) {
                if (vehicleService.findByLicensePlate(licensePlate) == null) {
                    break;
                } else {
                    System.out.println("Biển số đã tồn tại. Vui lòng nhập biển số khác.");
                }
            } else {
                System.out.println("Biển số xe không hợp lệ. Vui lòng nhập đúng định dạng (VD: 76A-123.45).");
            }
        }
        String status = inputStatus();
        Vehicle vehicle = new Vehicle(name, phoneNumber, licensePlate, status);
        System.out.println("Thêm mới thành công.");
        return vehicle;
    }

    public void displayVehicleDetails() {
        List<Vehicle> vehicleList = vehicleService.findAll();
        System.out.println("Nhập biển số xe cần tìm kiếm: ");
        String licensePlate = scanner.nextLine();
        String validLicensePlate = input.getCheckLicensePlateEnter(licensePlate);
        if (validLicensePlate == null) {
            return;
        }

        Vehicle foundVehicle = null;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getLicensePlate().equalsIgnoreCase(validLicensePlate)) {
                foundVehicle = vehicle;
                break;
            }
        }

        if (foundVehicle != null) {
            System.out.println("Thông tin chi tiết xe:");
            System.out.println("1. Tên khách: " + foundVehicle.getName());
            System.out.println("2. Số điện thoại khách: " + foundVehicle.getPhoneNumber());
            System.out.println("3. Biển số: " + foundVehicle.getLicensePlate());
            System.out.println("4. Tình trạng: " + foundVehicle.getStatus());
        } else {
            System.out.println("Xe không có trong hệ thống.");
        }
    }

    public void updateVehicle() {
        System.out.println("Nhập biển số xe cần cập nhập: ");
        String licensePlate = scanner.nextLine();
        String validLicensePlate = input.getCheckLicensePlateEnter(licensePlate);
        if (validLicensePlate == null) {
            return;
        }

        Vehicle vehicleUpdate = vehicleService.findByLicensePlate(licensePlate);
        if (vehicleUpdate == null) {
            System.out.println("Không tìm thấy trong hệ thống");
            return;
        }

        System.out.println("Thông tin hiện tại của xe: ");
        System.out.println("1. Tên khách: " + vehicleUpdate.getName());
        System.out.println("2. Số điện thoại khách: " + vehicleUpdate.getPhoneNumber());
        System.out.println("3. Biển số: " + vehicleUpdate.getLicensePlate());
        System.out.println("4. Tình trạng: " + vehicleUpdate.getStatus());

        System.out.println("Nhập tên mới (bỏ trống để giữ nguyên): ");
        String newName = scanner.nextLine();
        newName = input.capitalizeFirstLetter(newName);
        if (!newName.isEmpty()) {
            vehicleUpdate.setName(newName);
        }

        System.out.println("Nhập số điện thoại mới (bỏ trống để giữ nguyên): ");
        String newPhoneNumber = scanner.nextLine();
        if (!newPhoneNumber.isEmpty()) {
            while (!input.checkPhoneNumber(newPhoneNumber)) {
                System.out.println("không hợp lệ vui lòng nhập lại: ");
                newPhoneNumber = scanner.nextLine();
            }
            vehicleUpdate.setPhoneNumber(newPhoneNumber);
        }

        System.out.println("Nhập biển số xe(bỏ trống để giữ nguyên): ");
        String newLicensePlate = scanner.nextLine();
        if (!newLicensePlate.isEmpty()) {
            while (!input.checkLicensePlate(newLicensePlate) || vehicleService.findByLicensePlate(newLicensePlate) != null) {
                if (!input.checkLicensePlate(newLicensePlate)) {
                    System.out.println("Biển số xe không hợp lệ. Vui lòng nhập đúng định dạng (VD: 76A-123.45).");
                } else {
                    System.out.println("Biển số xe đã có trên hệ thống. Vui lòng nhập biển số khác. ");
                }
                newLicensePlate = scanner.nextLine();
                if (newLicensePlate.isEmpty()) {
                    break;
                }
            }
            if (!newLicensePlate.isEmpty()) {
                vehicleUpdate.setLicensePlate(newLicensePlate);
            }
        }

        String newStatus = inputStatus();
        if (!newStatus.isEmpty()) {
            vehicleUpdate.setStatus(newStatus);
        }

        vehicleService.updateVehicle(vehicleUpdate);
        System.out.println("Cập nhập thành công.");
    }

    public void deleteVehicle() {
        System.out.println("Biển số xe cần xoá: ");
        String remove = scanner.nextLine();
        String validLicensePlate = input.getCheckLicensePlateEnter(remove);
        if (validLicensePlate == null) {
            return;
        }

        int initialSize = vehicleService.findAll().size();
        vehicleService.deleteVehicle(validLicensePlate);
        int newSize = vehicleService.findAll().size();

        if (newSize < initialSize) {
            System.out.println("Xóa thành công.");
        } else {
            System.out.println("Không tìm thấy xe để xoá");
        }
    }

    public void showVehicleMenu() {
        int i;
        do {
            System.out.println("====MENU QUẢN LÝ XE====");
            System.out.println("1. Hiện thị danh sách.");
            System.out.println("2. Thêm xe mới.");
            System.out.println("3. Hiển thị xe.");
            System.out.println("4. Cập nhập thông tin.");
            System.out.println("5. Xoá xe.");
            System.out.println("0. Trở lại Menu chính. ");
            System.out.println("==MỜI CHỌN CHỨC NĂNG==");
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    display();
                    break;
                case 2:
                    Vehicle vehicle = inputDataVehicle();
                    vehicleService.addVehicle(vehicle);
                    break;
                case 3:
                    displayVehicleDetails();
                    break;
                case 4:
                    updateVehicle();
                    break;
                case 5:
                    deleteVehicle();
                    break;
            }
        } while (i != 0);
    }
}
