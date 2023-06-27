/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_1;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Student {
private String  sname, snumber;
private int score1, score2;

Student(String Na,String No, int t1, int t2)
{
Scanner s = new Scanner(System.in);
//System.out.println("Enter Student Name: ");
sname = Na;
//System.out.println("Enter Student Number: ");
snumber = No;
//System.out.println("Enter Student Score 1: ");
score1 = t1;
while(t1<0 || t1>100)
{
System.out.println("INVALID! Score must be between 0 and 100");
t1 =s.nextInt();
}
//System.out.println("Enter Student Score 2: ");
score2 = t2;
while(t1<0 || t1>100)
{
System.out.println("INVALID! Score must be between 0 and 100");
t1 =s.nextInt();
}
}


public void displaydata(){
System.out.println("The student details are: " + sname + " " + snumber );
System.out.println("The student's scores are: Score1: " + score1 + " " + "Score2: " + score2);

}
    
}
