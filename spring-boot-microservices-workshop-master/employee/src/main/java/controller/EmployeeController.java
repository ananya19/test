package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

@RestController     // for rest response
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    // to add new employee
    @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @PostMapping
    public Employee save(Employee employee){
        return employeeService.save(employee);
    }
    // list of all employee
    @RequestMapping(value = "listEmployee",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Employee> listEmployee() {
        return employeeService.findAll();
    }
    // delete specific employee using employee id
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)        // or use @DeleteMapping
    public void delete(@RequestParam("id")long id){
        employeeService.delete(id);
    }
    // search employee start with name
    @RequestMapping(value = "startWithName/{name}")
    public java.util.List<Employee> findByName(@PathVariable("name")String name){
        return employeeService.findEmployeeByEmployeeNameStartingWith(name);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("id") String id) {
        //logger.info("Fetching User with id {}", id);
        Employee user = employeeService.findById(id);
        if (user == null) {
            //logger.error("User with id {} not found.", id);
            return new ResponseEntity(new Error("User with id " + id
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Employee>(user, HttpStatus.OK);
    }

    // search employee by role
    @RequestMapping(value = "findById/{id}")
    public java.util.List<Employee> findById(@PathVariable("id")String id){

        return employeeService.findEmployeeByEmployeeRole(id);
    }
}