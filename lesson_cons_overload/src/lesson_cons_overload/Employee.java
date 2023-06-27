/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson_cons_overload;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Employee {
private String ename;
private int enumber, esalary;
Employee()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter name ");
ename = s.next();
System.out.println("Enter number ");
enumber = s.nextInt();
System.out.println("Enter salary ");
int y = s.nextInt();
System.out.println("Enter commission ");
int z = s.nextInt();
esalary =(y+z);
}
Employee(int x)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter name ");
ename = s.next();
System.out.println("Enter number ");
enumber = s.nextInt();
System.out.println("Enter commission ");
esalary = s.nextInt();

}
public void display()
{
System.out.println("Your salary is: " + esalary);
}
    
}
