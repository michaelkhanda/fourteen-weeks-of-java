/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8_inheritance;

/**
 *
 * @author michaelkhanda
 */
public class HourlyEmployee extends Employee {

private double hourly_wage;
private double hours_worked;

public HourlyEmployee(String n, String no, double wages, double hours)

{
super(n,no);
hourly_wage = wages;
hours_worked = hours;

}

    public double getHourly_wage() {
        return hourly_wage;
    }

    public void setHourly_wage(double hourly_wage) {
        this.hourly_wage = hourly_wage;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

@Override
public double earnings()
{
return hourly_wage * hours_worked;
}
   
}
