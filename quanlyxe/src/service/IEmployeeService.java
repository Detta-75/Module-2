package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void addEmployee(Employee employee);

    void deleteEmployee(String id);

    void updateEmployee(Employee employee);

    Employee findById(String id);
}
