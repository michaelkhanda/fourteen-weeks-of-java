/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labex_week3;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Course_details {
private String  Instructor_name, Instructor_course, Instructor_Department;

Course_details(String Name,String Course, String Department)
{
Scanner s = new Scanner(System.in);
Instructor_name = Name;
Instructor_course = Course;
Instructor_Department = Department;

}

public void displaydata()
{
System.out.println("The details of the instructor are: " + Instructor_name + Instructor_course + Instructor_Department);
}
}
