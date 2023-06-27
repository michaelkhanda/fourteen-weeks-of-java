/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_thursday;

/**
 *
 * @author michaelkhanda
 */
import static java.lang.Math.*;
public class Week4_Thursday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Student s1 = new Student();
s1.InputData("Mike Khanda", "662903");
s1.EditOrganization("USIU");
s1.DisplayData();
//System.out.println(s1.toString());
//System.out.println(s1.toString(1));

Student s2 = new Student();
s2.InputData("Neema Mkenda", "663156");
s2.EditOrganization("USIU-A");
s1.DisplayData();
s2.DisplayData();
int a = 8;
double b = pow(a,2);
System.out.println("The square is " + b);
//System.out.println(s1.toString());
//System.out.println(s1.toString(1));
    }
    
}
