package day03.part06.hr;

import day03.part06.hr.Roles;
import day03.part06.ISalary;
import day03.part06.salary.Overtime;
import day03.part06.salary.Transportasi;

import java.time.LocalDate;

public class Programmer extends  Employee implements ISalary {

    private Transportasi transport;
    private Overtime makan;

    public Programmer(int empId, String fullName, LocalDate hireDate, Roles role, double salary,
                      Transportasi transport, Overtime makan) {
        super(empId, fullName, hireDate, role, salary);
        this.transport = transport;
        this.makan = makan;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary()+ transport.getBensin()+ transport.getSpj()+ transport.getTransportasi()+ makan.getMakan());
    }
}
