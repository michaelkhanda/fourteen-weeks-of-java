/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lessoninterfaces;

/**
 *
 * @author michaelkhanda
 */
public class LessonInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Payable item = new Invoice( "Pens", 2, 375.00 );
Payable emp = new Employee( "John", "100", 800000 );
System.out.println(item.getPaymentAmount());
System.out.println(emp.getPaymentAmount());

    }
    
}
