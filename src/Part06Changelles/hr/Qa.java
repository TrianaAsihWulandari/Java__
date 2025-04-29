package Part06Changelles.hr;

import Part06Changelles.hr.Roles;
import Part06Changelles.ISalary;
import Part06Changelles.salary.Overtime;

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
