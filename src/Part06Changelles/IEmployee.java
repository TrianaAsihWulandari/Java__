package Part06Changelles;

import Part06Changelles.hr.Employee;
import Part06Changelles.hr.Programmer;
import Part06Changelles.hr.Sales;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    void displayEmployees(List<Employee> employees);

    void generateSalary(List<Employee> employees);

}
