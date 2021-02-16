package main.java.dao;

import model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee,Long> {
    List<Employee> findEmployeeByEmployeeNameStartingWith(String name); // fetch list of Employee which start with
    List<Employee> findEmployeeByEmployeeRole(String role);         // fetch Employee by role
    List<Employee> findAll();                           // fetch all Employee
    Employee findById(String id);

}
