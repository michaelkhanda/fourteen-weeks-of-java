/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8_inheritance;

/**
 *
 * @author michaelkhanda
 */
public class SalEmployee extends Employee{

private double eSalary; 
public SalEmployee( String n, String no, double sal )
{
super( n, no ); // explicit call to superclass
eSalary= sal ; 
}
  public double getSalary()
 { return eSalary;
 } 
 public void setSalary( double s )
 { eSalary = s;
 } 
public double earnings()
{
return eSalary;
}
 //@Override
 //public double earnings()
//{
 //return eSalary + ( getCommissionRate() * getGrossSales() ); //private members are not inherited
 //} // end method earnings
    
}
