package day03.part06.hr;

import day03.part06.hr.Roles;
import day03.part06.ISalary;
import day03.part06.salary.Overtime;

import java.time.LocalDate;

public class Qa extends Employee implements ISalary {
    private Overtime makan;

    public Qa(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Overtime makan) {
        super(empId, fullName, hireDate, role, salary);
        this.makan = makan;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary()+ makan.getMakan());
    }
}
