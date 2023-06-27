/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package oop_1;

import java.util.Scanner;

/**
*
* @author michaelkhanda
*/
public class OOP_1 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

// TODO code application logic here
System.out.println("Enter test score one");
int test1 = s.nextInt();
System.out.println("Enter test score two");
int test2 = s.nextInt();
Student S1 = new Student("Handah", "662757",test1,test2);
Student S2 = new Student("Neema", "663156", test1, test2);
//S1.inputdata();
S1.displaydata();
//S2.inputdata();
S2.displaydata();
}

}
