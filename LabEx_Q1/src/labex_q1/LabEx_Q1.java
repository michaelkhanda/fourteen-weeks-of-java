/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labex_q1;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class LabEx_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner s = new Scanner(System.in);
System.out.println("Enter the type of interest to calculate(c/s):  ");
String type_of_interest = s.next();

if(type_of_interest.equals("c"))
{
Interests i1 = new Interests();
i1.display();
}
else
{
Interests i1 = new Interests(1);
i1.display();
}
    }
    
}
