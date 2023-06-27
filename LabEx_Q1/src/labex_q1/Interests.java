/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labex_q1;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Interests {
private double principal,number_of_years,total_amount;
private double interest_rate = 0.05;
Interests()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the principal invested:");
principal = s.nextInt();
System.out.println("Enter the number of years");
number_of_years = s.nextInt();
total_amount = (principal * Math.pow(1 + interest_rate, number_of_years));


}

Interests(int simple)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the principal invested:");
principal = s.nextInt();
System.out.println("Enter the number of years");
number_of_years = s.nextInt();
total_amount = (principal * interest_rate * number_of_years);

}
    public void display()
{
System.out.println("Your total amount is: " + total_amount);
}
}
