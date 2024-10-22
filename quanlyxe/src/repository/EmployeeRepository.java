package repository;

import model.Employee;
import saveData.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    ReadAndWriteEmployee readAndWriteEmployee = new ReadAndWriteEmployee();
    static {
        employeeList.add(new Employee("Trần Văn A","0979055577","A-77","Sáng"));
        employeeList.add(new Employee("Nguyễn Văn B","0374595959","B-59","Chiều"));
        employeeList.add(new Employee("Lê Văn C","0392707070","C-70","Tối"));
    }

    @Override
    public List<Employee> findAll() {
        readAndWriteEmployee.ReadData();
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        readAndWriteEmployee.WriteData(employeeList);
        employeeList.add(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equalsIgnoreCase(employee.getId())) {
                employeeList.set(i, employee);
                break;
            }
        }
    }

    @Override
    public Employee findById(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }
}
