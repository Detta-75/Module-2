package controller;

import model.Employee;

import java.util.Scanner;

public class MenuController {
    EmployeeController employeeController = new EmployeeController();
    VehicleController vehicleController = new VehicleController();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        int i;
        do {
            System.out.println("====MENU====");
            System.out.println("1. Vehicle menu.");
            System.out.println("2. Employee menu");
            System.out.println("0. Thoát");
            System.out.println("==MỜI CHỌN CHỨC NĂNG==");
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    vehicleController.showVehicleMenu();
                    break;
                case 2:
                    employeeController.showEmployeeMenu();
                    break;
            }
        } while (i != 0);
    }
}
