package day03.part06;

import day03.part06.hr.Employee;
import day03.part06.hr.Programmer;
import day03.part06.hr.Sales;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    void displayEmployees(List<Employee> employees);

    void generateSalary(List<Employee> employees);

}
