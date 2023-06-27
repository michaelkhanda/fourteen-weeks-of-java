/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8_inheritance;

/**
 *
 * @author michaelkhanda
 */
public abstract class Employee {

private String eName;
private String eNumber;
//private double grossSales; // gross weekly sales
//private double commissionRate; // commission percentage

public Employee( String first, String no)
{eName = first;
eNumber = no;
//grossSales= sales ; // validate and store gross sales
//commissionRate= rate ; // validate and store commission rate
} // end five-argument CommissionEmployee constructor

 public String getName()
 {return eName;
 } 
 public void setName( String last )
 { eName = last; 
 } 
 public void setNumber( String no )
 { eNumber = no; 
 }
 public String getNumber()
 { return eNumber;
 } 
 //public void setGrossSales( double sales )
 //{ grossSales = sales;
  //} 
 //public double getGrossSales()
 //{ return grossSales;
 //} 
//public void setCommissionRate( double rate )
 //{ commissionRate = rate;
 
 //} 

 //public double getCommissionRate()
 //{ return commissionRate;
 //} 

public abstract double earnings();
//{
//return commissionRate * grossSales;
//} // end method earnings
}  



