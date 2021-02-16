package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "employee")
public class Employee {
    @Id                                                     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // auto increment
    @Column(name = "employeeId")
    private long employeeId;
    @Column(name = "employeeName")
    private String employeeName;
    @Column(name = "employeeRole")
    private String employeeRole;

    @Column(name="gradeYear")
    private Map<String, String> gradeYear;


    @Column(name="experienceYears")
    private int experienceYears;

    public Map<String, String> getGradeYear() {
        return gradeYear;
    }
    public void setGradeYear(Map<String, String> gradeYear) {
        this.gradeYear = gradeYear;
    }
    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeRole() {
        return employeeRole;
    }
    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}