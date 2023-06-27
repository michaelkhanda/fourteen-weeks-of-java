/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_arrays;

/**
 *
 * @author michaelkhanda
 */
import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Student {
private String sname, snumber;

private enum Test {Quiz_1(25), Quiz_2(25), Mid_Sem(20), Final_Sem(30); private final int mark_score; Test(int mark_score ){this.mark_score = mark_score;} };

Test T;

public void InputData()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter name:");
sname = s.next();
System.out.println("Enter number:");
snumber = s.next();
System.out.println("Enter test: ");
int count = 1;
for(Test T: Test.values())
{
System.out.println(count + " " + T);
count++;
}
int exam_number = s.nextInt();
switch(exam_number)
{
case 1: 
T = Test.Quiz_1;
break;

case 2: 
T = Test.Quiz_2;
break;

case 3: 
T = Test.Mid_Sem;
break;

case 4: 
T = Test.Final_Sem;
break;

default:
T = null;
break;

}

}

public void DisplayData()
{
System.out.println("The student details are: " + sname + " " + snumber + " " + T +  " " + T.mark_score);
}

}

