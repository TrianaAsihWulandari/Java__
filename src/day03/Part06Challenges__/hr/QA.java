package day03.Part06Challenges__.hr;

import day03.Part06Challenges__.ISalary;
import day03.Part06Challenges__.salary.Overtime;

import java.time.LocalDate;

public class QA extends Employee implements ISalary {

    private Overtime makan;

    public QA(String nationalId, String fullName, int empId, LocalDate hireDate, double salary, Overtime makan) {
        super(nationalId, fullName, empId, hireDate, Roles.QA, salary);
        this.makan = makan;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary((getSalary()+ makan.getMakan())-getTotalTax());
    }

    @Override
    public void calcTax() {
        setTotalTax(getSalary() * 0.01);
    }
}
