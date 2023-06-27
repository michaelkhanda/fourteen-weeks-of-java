/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8_inheritance;

/**
 *
 * @author michaelkhanda
 */
public class ComEmployee extends Employee {

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage
public ComEmployee( String n, String no, double sales, double rate )
{
super( n, no ); // explicit call to superclass
grossSales= sales ; 
commissionRate = rate;
}
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
@Override
public double earnings()
{
return grossSales * commissionRate;
}


    
}
