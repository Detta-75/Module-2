package controller;

import Input.Input;
import model.Employee;
import service.EmployeeService;
import service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private IEmployeeService employeeService = new EmployeeService();
    private Scanner scanner = new Scanner(System.in);
    private Input input = new Input();

    private String inputShift() {
        String shift;
        while (true) {
            System.out.println("Nhập ca trực (Sáng/Chiều/Tối): ");
            shift = scanner.nextLine();
            shift = input.capitalizeFirstLetter(shift);

            if (shift.equalsIgnoreCase("Sáng") || shift.equalsIgnoreCase("Chiều") || shift.equalsIgnoreCase("Tối")) {
                return shift;
            } else {
                System.out.println("Ca trực không hợp lệ. Vui lòng nhập lại (Sáng/Chiều/Tối).");
            }
        }
    }

    public void display() {
        List<Employee> employeeList = employeeService.findAll();
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            System.out.println("Danh sách nhân viên trong hệ thống:");
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }

    public Employee inputDataEmployee() {
        String id;
        while (true) {
            System.out.println("Nhập ID nhân viên: ");
            id = scanner.nextLine();
            if (input.checkID(id)) {
                if (employeeService.findById(id) == null) {
                    break;
                } else {
                    System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
                }
            } else {
                System.out.println("Nhập sai ID. Vui lòng nhập đúng định dạng (VD: A-12)");
            }
        }

        System.out.println("Nhập tên nhân viên: ");
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

        String shift =inputShift();
        Employee employee = new Employee(name,phoneNumber,id,shift);
        System.out.println("Thêm mới thành công.");
        return employee;
    }

    public void updateEmployee() {
        System.out.println("Nhập ID cần cập nhập: ");
        String ID = scanner.nextLine();
        String validID = input.getCheckIDEnter(ID);
        if (validID == null) {
            return;
        }

        Employee employeeUpdate = employeeService.findById(ID);
        if (employeeUpdate == null) {
            System.out.println("Không tìm thấy trong hệ thống ");
            return;
        }

        System.out.println("Thông tin của nhân viên: ");
        System.out.println("1. ID: " + employeeUpdate.getId());
        System.out.println("2. Tên nhân viên: " + employeeUpdate.getName());
        System.out.println("3. Số điện thoại: " + employeeUpdate.getPhoneNumber());
        System.out.println("4. Ca trực: " + employeeUpdate.getShift());

        System.out.println("Nhập ID mới (bỏ trống để giữ nguyên): ");
        String newID = scanner.nextLine();
        if (!newID.isEmpty()) {
            while (!input.checkID(newID) || employeeService.findById(newID) != null) {
                if (!input.checkID(newID)) {
                    System.out.println("ID Không hợp lệ. Vui lòng nhập đúng định dạng (VD: A-12)");
                } else {
                    System.out.println("ID đã có trên hệ thống. Vui lòng nhập lại ID khác");
                }
                newID = scanner.nextLine();
                if (newID.isEmpty()) {
                    break;
                }
            }
            if (!newID.isEmpty()) {
                employeeUpdate.setId(newID);
            }
        }

        System.out.println("Nhập tên mới (bỏ trống để giữ nguyên): ");
        String newName = scanner.nextLine();
        newName = input.capitalizeFirstLetter(newName);
        if (!newName.isEmpty()) {
            employeeUpdate.setName(newName);
        }

        System.out.println("Nhập số điện thoại mới (bỏ trống để giữ nguyên):");
        String newPhoneNumber = scanner.nextLine();
        if (!newPhoneNumber.isEmpty()) {
            while (!input.checkPhoneNumber(newPhoneNumber)) {
                System.out.println("Không hợp lệ vui lòng nhập lại: ");
                newPhoneNumber = scanner.nextLine();
            }
            employeeUpdate.setPhoneNumber(newPhoneNumber);
        }

        String newShift = inputShift();
        if (!newShift.isEmpty()) {
            employeeUpdate.setShift(newShift);
        }

        employeeService.updateEmployee(employeeUpdate);
        System.out.println("Cập nhập thành công");
    }

    public void deleteEmployee() {
        System.out.println("Nhập ID cần xóa: ");
        String remove = scanner.nextLine();
        String validEmployee = input.getCheckIDEnter(remove);
        if (validEmployee == null) {
            return;
        }

        int initialSize = employeeService.findAll().size();
        employeeService.deleteEmployee(validEmployee);
        int newSize = employeeService.findAll().size();

        if (newSize < initialSize) {
            System.out.println("Xóa thành công.");
        } else {
            System.out.println("Không tìm thấy ID để xóa.");
        }
    }
    public void showEmployeeMenu() {
        int i;
        do {
            System.out.println("====MENU NHÂN VIÊN====");
            System.out.println("1. Hiện thị danh sách nhân viên.");
            System.out.println("2. Thêm nhân viên.");
            System.out.println("3. Cập nhập thông tin.");
            System.out.println("4. Xoá nhân viên.");
            System.out.println("0. Trở lại Menu chính.");
            System.out.println("==MỜI CHỌN CHỨC NĂNG==");
            i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    display();
                    break;
                case 2:
                    Employee employee = inputDataEmployee();
                    employeeService.addEmployee(employee);
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
            }
        } while (i != 0);
    }
}
