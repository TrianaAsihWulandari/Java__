package day03.part04;

import java.time.LocalDate;

public class Qa extends Employee{
    private double makan;

    public double getMakan() {
        return makan;
    }

    public void setMakan(double makan) {
        this.makan = makan;
        super.setTotalSalary(this.getSalary()+makan);
    }

    public Qa(String fullName, LocalDate hireDate, double salary, double makan) {
        super(fullName, hireDate, Roles.QA, salary);
        this.makan = makan;
        setTotalSalary(salary+makan);
    }

    @Override
    public String toString() {
        return super.toString() +
                "makan=" + makan +
                '}';
    }
}
