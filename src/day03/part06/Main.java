package day03.part06;

import day03.part06.hr.Employee;
import day03.part06.hr.Programmer;
import day03.part06.hr.Sales;

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
