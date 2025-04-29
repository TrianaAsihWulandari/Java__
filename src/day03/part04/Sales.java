package day03.part04;

import java.time.LocalDate;

public class Sales extends Employee{
    private double bonus;
    private double comission;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        super.setTotalSalary(this.getSalary()+bonus+comission);
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
        super.setTotalSalary(this.getSalary()+bonus+comission);
    }
    public Sales(String fullName, LocalDate hireDate,  double salary, double bonus, double comission) {
        super(fullName, hireDate, Roles.SALES, salary);
        this.bonus = bonus;
        this.comission = comission;
        setTotalSalary(salary+comission+bonus);
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus +
                ", comission=" + comission +
                '}';
    }
}
