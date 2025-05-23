package day03.part04;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // implement encapsulation
        Employee emp1 = new Employee(); //default/empty constructor
        emp1.setEmpId(101);
        emp1.setFullName("Anton");
        emp1.setHireDate(LocalDate.of(2025,4,12));
        emp1.setRole(Roles.PROGRAMMER);
        emp1.setSalary(6_000_000);

        //System.out.println(emp1.toString());

        Employee emp2 = new Employee(102,"Budi",
                LocalDate.of(2025,1,12),
                Roles.PROGRAMMER,6_000_000);


        Employee emp3 = new Employee("Rini",
                LocalDate.of(2025,1,12),
                Roles.SALES,6_000_000);



        Programmer prog1 = new Programmer("Widi",
                LocalDate.of(2025,1,16),6_000_000,500_000);

        // set untuk ubah value transportasi
        prog1.setTransportasi(600_000);



        //contoh aja : call overloading method, contoh polymorphism di level methods
        /*prog1.getTunjangan(100);
        prog1.getTunjangan(200,LocalDate.of(2025,1,12));*/

        Employee emp5 = new Programmer("Yuli",
                LocalDate.of(2025,1,16),6_000_000,500_000);

        Employee emp6 = new Sales("Rian",LocalDate.of(2025,4,24),5000000,2000000,500000);

        Employee emp7 = new Qa("Gita",LocalDate.of(2025,4,24),4500000,10000);


        List<Employee> listEmployee= List.of(emp1,emp2,emp3,prog1,emp5,emp6,emp7);
        for (Employee emp : listEmployee){
            System.out.println(emp.toString());
        }

        // totalEmployee dimiliki oleh class, bukan object instance
        System.out.println("Total Employee : "+ Employee.totalEmployee);
    }
}
