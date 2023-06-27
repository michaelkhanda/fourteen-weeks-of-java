/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_encapsulation;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Student {
    private String sname,snumber;

public void setname(String na)
{
sname = na;
}
public String checknumber(String number)
{
if (number.length() == 6)
{
return number;
}
return snumber;

}
public void setnumber(String num)
{
snumber = checknumber(num);
snumber = num;
}
public String getname()
{
return sname;
}
public String getnumber()
{
return snumber;
}



public void InputData()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter student name");
sname = s.next();
System.out.println("Enter student number");
snumber = s.next();

}
public void DisplayData()
{
System.out.println("The student details are: " + " " +sname + " " + snumber);
}
}
