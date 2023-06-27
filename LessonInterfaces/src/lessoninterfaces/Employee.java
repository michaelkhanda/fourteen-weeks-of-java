/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessoninterfaces;

/**
 *
 * @author michaelkhanda
 */
public class Employee implements Payable{
    private String eName;
private String eNumber;
private double Salary;

 public Employee( String n, String no, double s )
 {
eName = n;
 eNumber = no;
 Salary = s;
 }
 public void setName( String n )
 { eName = n; 
 } 
 public String getName()
 { return eName;
 } 
 public void setNumber( String no )
 { eNumber = no; 
 } 
 public String getNumber()
 { return eNumber;
 } 
  public void setSalary( double s )
 { Salary = s; 
 } 
  public double getSalary()
 { return Salary;
 } 
@Override
public double getPaymentAmount()
{return getSalary();
}
}
