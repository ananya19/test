package main.java.model;

@Entity
@Table(name = "employee")
public class Rating {

    public int getYearsOfExp() {
        return YearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        YearsOfExp = yearsOfExp;
    }

    int YearsOfExp;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    int grade;

}
