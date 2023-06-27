/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson_cons_overload;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Lesson_cons_overload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String j;
Scanner s = new Scanner(System.in);
System.out.println("Enter the type of employee(p/t):  ");
j = s.next();

if(j.equals("p"))//p = permanent
{ 
Employee e1 = new Employee();
e1.display();
}
else
{
Employee e1 = new Employee(1);//1 represents that the constructor has one parameter
e1.display();
}

    }
    
}
