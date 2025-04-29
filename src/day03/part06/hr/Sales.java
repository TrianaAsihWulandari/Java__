package day03.part06.hr;

import day03.part06.hr.Roles;
import day03.part06.ISalary;
import day03.part06.salary.Commission;
import day03.part06.salary.Overtime;

import java.time.LocalDate;

public class Sales extends Employee implements ISalary {

    private Commission commision;
    private Overtime makan;


    public Sales(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Commission commision,
                 Overtime makan) {
        super(empId, fullName, hireDate, role, salary);
        this.commision = commision;
        this.makan = makan;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary()+ commision.getComision()+ commision.getBonus()+ makan.getMakan());
    }
}
