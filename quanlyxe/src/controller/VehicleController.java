package controller;

import model.Vehicle;
import service.IVehicleService;
import service.VehicleService;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VehicleController {
    private IVehicleService vehicleService = new VehicleService();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("====MENU====");
        System.out.println("1. Hiện thị danh sách");
        System.out.println("2. Thêm xe mới");
        System.out.println("3. Hiển thị xe");
        System.out.println("4. Cập nhập thông tin");
        System.out.println("5. Xoá theo biển số");
        System.out.println("0. Thoát");
        System.out.println("==MỜI CHỌN CHỨC NĂNG==");
    }

    public void display(List<Vehicle> vehicleList) {
        for (int j = 0; j < vehicleList.size(); j++) {
            System.out.println(vehicleList.get(j));
        }
    }

    public boolean checkLicensePlate(String licensePlate) {
        String licensePlatePattern = "^\\d{2}[A-Z]-\\d{3}\\.\\d{2}$";
        return Pattern.matches(licensePlatePattern, licensePlate);
    }

    public String getRemoveEnter(String initialLicensePlate) {
        String licensePlate = initialLicensePlate;
        boolean isValid = false;
        while (!isValid) {
            if (!checkLicensePlate(licensePlate)) {
                System.out.println("Biển số xe không hợp lệ. Vui lòng nhập đúng định dạng (VD: 76A-123.45).");
                System.out.println("Bạn có muốn nhập lại không:(Y/N)");
                String retry = scanner.nextLine().toLowerCase();
                if (retry.equals("n")) {
                    System.out.println("Hủy thao tác.");
                    return null;
                } else if (retry.equals("y")) {
                    System.out.println("Mời nhập lại biển số: ");
                    licensePlate = scanner.nextLine();
                }
            } else {
                isValid = true;
            }
        }
        return licensePlate;
    }

    public Vehicle inputDataVehicle() {
        String licensePlate;
        while (true) {
            System.out.println("Biển số xe: ");
            licensePlate = scanner.nextLine();
            if (checkLicensePlate(licensePlate)) {
                break;
            } else {
                System.out.println("Biển số xe không hợp lệ. Vui lòng nhập đúng định dạng (VD: 76A-123.45).");
            }
        }
        System.out.println("Loại xe: ");
        String vehicleType = scanner.nextLine();
        System.out.println("Màu xe: ");
        String color = scanner.nextLine();
        System.out.println("Hãng xe: ");
        String brand = scanner.nextLine();
        System.out.println("Tình trạng xe: ");
        String status = scanner.nextLine();
        Vehicle vehicle = new Vehicle(licensePlate, vehicleType, color, brand, status);
        System.out.println("Thêm mới thành công.");
        return vehicle;
    }

    public void displayVehicleDetails(List<Vehicle> vehicleList, String licensePlate) {
        String validLicensePlate = getRemoveEnter(licensePlate);
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
            System.out.println("Biển số: " + foundVehicle.getLicensePlate());
            System.out.println("Loại xe: " + foundVehicle.getVehicleType());
            System.out.println("Màu xe: " + foundVehicle.getColor());
            System.out.println("Hãng xe: " + foundVehicle.getBrand());
            System.out.println("Tình trạng: " + foundVehicle.getStatus());
        } else {
            System.out.println("Xe không có trong hệ thống.");
        }
    }

    public void removeVehicle(String remove) {
        String validLicensePlate = getRemoveEnter(remove);
        if (validLicensePlate == null) {
            return;
        }
        int initialSize = vehicleService.findAll().size();
        vehicleService.removeVehicle(validLicensePlate);
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
            menu();
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    System.out.println("Danh sách xe trên hệ thống: ");
                    List<Vehicle> vehicleList = vehicleService.findAll();
                    display(vehicleList);
                    break;
                case 2:
                    Vehicle vehicle = inputDataVehicle();
                    vehicleService.addVehicle(vehicle);
                    break;
                case 3:
                    System.out.println("Nhập biển số xe cần tìm kiếm: ");
                    String seachLicensePlate = scanner.nextLine();
                    List<Vehicle> currentVehicleList = vehicleService.findAll();
                    displayVehicleDetails(currentVehicleList, seachLicensePlate);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Biển số xe cần xoá: ");
                    String remove = scanner.nextLine();
                    removeVehicle(remove);
                    break;
            }
        } while (i != 0);
    }
}
