/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4_thursday;

/**
 *
 * @author michaelkhanda
 */
public class Student {
private static String organization;
private String sname,snumber;
public final String department;
Student()
{
department = "SHSS";
}

public void InputData(String sname, String snumber)
{
this.sname = sname;
this.snumber = snumber;
}


public String toString()
{
return "Student name" + " " + sname + " " + snumber;
}


public void EditOrganization(String org)
{
this.organization = org;
}


public String toString(int x)
{
return "Student name" + " " + sname ;
}

public void DisplayData()
{
System.out.println("The organisation is " + organization );
System.out.println("The student name is: " + sname);
System.out.println("The student number is: " + snumber);

}

}
