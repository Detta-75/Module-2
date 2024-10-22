package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();

    void addEmployee(Employee employee);

    void deleteEmployee(String id);

    void updateEmployee(Employee employee);

    Employee findById(String id);
}
