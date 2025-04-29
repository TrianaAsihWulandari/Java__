package day03.Part06Challenges__;

import day03.Part06Challenges__.hr.Employee;
import day03.Part06Challenges__.hr.Programmer;

import java.util.List;

public interface IEmployee {

    List<Employee> initListEmployee();

    void displayEmployees(List<Employee> emps);

    void generateSalary(List<Employee> emps);

    void generateTax(List<Employee> emps);
}
