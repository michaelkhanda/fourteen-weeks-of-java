/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsinclass;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Students {
private String sname;
private int snumber;

Scanner s = new Scanner (System.in);


public void inputdata()
{
System.out.println("Enter name ");
sname = s.next();
System.out.println("Enter number ");
snumber = s.nextInt();
}

public void display()
{
System.out.println("The name is " + sname  + "Student number: " + snumber);
}
    
}
