package Part06Changelles;

import Part06Changelles.hr.Employee;
import Part06Changelles.hr.Programmer;
import Part06Changelles.hr.Sales;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        IEmployee empInf = new EmployeeImpl();

        List<Employee> employees = empInf.initListEmployee();


        //generate salary
        empInf.generateSalary(employees);

        empInf.displayEmployees(employees);
    }
}
