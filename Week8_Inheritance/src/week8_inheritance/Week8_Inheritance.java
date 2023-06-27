/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week8_inheritance;

/**
 *
 * @author michaelkhanda
 */
public class Week8_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// instantiate CommissionEmployee object
ComEmployee emp = new ComEmployee("John", "100", 10000.0, .06);
SalEmployee emp2 = new SalEmployee("Mike", "200", 10000.0);
HourlyEmployee emp3 = new HourlyEmployee("Karen Price", "300", 16.75, 40.00);
ComEmployee emp4 = new BasePlusCommissionEmployee("Bob Lewis","400", 5000000,0.04,300.00);
//SalEmployee emp3 = (SalEmployee)emp2;

 // get commission employee data
 System.out.println("Employee information obtained by get methods:" );
 System.out.println("Name is: "+emp2.getName());
 System.out.println( "Social security number is: "+emp2.getNumber() );
 //System.out.println( "Gross sales is: "+emp3.getGrossSales()  );
 //System.out.println(  "Commission rate is: "+emp3.getCommissionRate() );
 System.out.println(  "Earnings : "+emp2.earnings() );
 System.out.println(  "Salary is : "+emp2.getSalary() + "\n");
 
 System.out.println("Employee information obtained by get methods: " );
 System.out.println("Name is: "+emp.getName());
 System.out.println( "Social security number is: "+emp.getNumber() );
 System.out.println( "Gross sales is: "+emp.getGrossSales()  );
 System.out.println(  "Commission rate is: "+emp.getCommissionRate() );
 System.out.println(  "Earnings : "+emp.earnings() + "\n");
 
 System.out.println("Employee information obtained by get methods: " );
 System.out.println("Name is: "+emp3.getName());
 System.out.println( "Social security number is: "+emp3.getNumber() );
 System.out.println( "Hourly wage is: "+emp3.getHourly_wage()  );
 System.out.println(  "Hours worked is: "+emp3.getHours_worked() );
 System.out.println(  "Earnings : "+emp3.earnings() + "\n");
 
 System.out.println("Employee information obtained by get methods: " );
 System.out.println("Name is: "+emp4.getName());
 System.out.println( "Social security number is: "+emp4.getNumber() );
 System.out.println( "Gross sales is: "+emp4.getGrossSales()  );
 System.out.println(  "Commission rate is: "+emp4.getCommissionRate() );
 System.out.println(  "Earnings : "+emp4.earnings() + "\n");
 
 
 } // end main
 } // end class
    
    

