package Part06Changelles;

import Part06Changelles.hr.Roles;
import Part06Changelles.hr.Employee;
import Part06Changelles.hr.Programmer;
import Part06Changelles.hr.Qa;
import Part06Changelles.hr.Sales;
import Part06Changelles.salary.Commission;
import Part06Changelles.salary.Transportasi;
import Part06Changelles.salary.Overtime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements IEmployee{
    @Override
    public List<Employee> initListEmployee() {
        List<Employee> employees = new ArrayList<>();

        Programmer emp1 = new Programmer(101,"Yuli",
                LocalDate.of(2025,12,12), Roles.PROGRAMMER,6_000_000,
                new Transportasi(LocalDate.now(),500_000,150_000,100_00), new Overtime(LocalDate.now(), 50_000)
        );

        Programmer emp2 = new Programmer(102,"Widi",
                LocalDate.of(2025,12,12), Roles.PROGRAMMER,5_000_000,
                new Transportasi(LocalDate.now(),100_000,50_000,100_00), new Overtime(LocalDate.now(), 50_000)
        );

        Sales emp3 = new Sales(103,"Fahmi",
                LocalDate.of(2025,12,12), Roles.SALES,5_000_000,
                new Commission(LocalDate.now(),100_000,50_000), new Overtime(LocalDate.now(), 50_000)
        );

        Qa emp4 = new Qa(103,"Fahmi",
                LocalDate.of(2025,12,12), Roles.QA,5_000_000, new Overtime(LocalDate.now(), 50_000)
        );


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    }

    @Override
    public void displayEmployees(List<Employee> employees) {
        for(Employee emp : employees){
            System.out.println(emp.toString());
        }
    }

    @Override
    public void generateSalary(List<Employee> employees) {
        for(Employee emp : employees){
            emp.calculateTotalSalary();
        }
    }
}
