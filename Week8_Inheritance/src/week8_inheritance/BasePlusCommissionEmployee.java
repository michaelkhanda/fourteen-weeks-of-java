/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8_inheritance;

/**
 *
 * @author michaelkhanda
 */
public class BasePlusCommissionEmployee extends ComEmployee {

public double base_salary;

public BasePlusCommissionEmployee(String n, String no, double sales, double rate, double BaseSalary)
{
super(n,no,sales,rate);
base_salary = BaseSalary;
}

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

@Override
public double earnings()
{
    System.out.println("");
return super.getGrossSales() * super.getCommissionRate() * base_salary;
}





    
}
