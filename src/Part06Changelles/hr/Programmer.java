package Part06Changelles.hr;

import Part06Changelles.hr.Roles;
import Part06Changelles.ISalary;
import Part06Changelles.salary.Overtime;
import Part06Changelles.salary.Transportasi;

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
