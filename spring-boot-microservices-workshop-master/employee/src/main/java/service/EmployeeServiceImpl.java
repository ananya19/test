package service;

import dao.EmployeeDao;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDAO;

    List<Employee> employeeList;
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(String id) {
        for(Employee employee : employeeList){
            if(id.equals(employee.getEmployeeId())){
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> findEmployeeByEmployeeNameStartingWith(String name) {
        return employeeDAO.findEmployeeByEmployeeNameStartingWith(name);
    }
    @Override
    public List<Employee> findEmployeeByEmployeeRole(String role) {
        return employeeDAO.findEmployeeByEmployeeRole(role);
    }
    @Override
    public void delete(long employeeId) {
        Optional<Employee> employee =(employeeDAO.findById(employeeId));
        employeeDAO.delete(employee);
    }
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }
}
