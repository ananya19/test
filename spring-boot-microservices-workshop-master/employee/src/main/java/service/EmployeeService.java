package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findEmployeeByEmployeeNameStartingWith(String name); // fetch list of Employee which start with
    List<Employee> findEmployeeByEmployeeRole(String role);         // fetch Employee by role
    List<Employee> findAll();
    Employee findById(String id);
    Employee save(Employee employee);
    void delete(long employeeId);
}
