package Part06Changelles.hr;

import Part06Changelles.hr.Roles;
import Part06Changelles.ISalary;
import Part06Changelles.salary.Commission;
import Part06Changelles.salary.Overtime;

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
