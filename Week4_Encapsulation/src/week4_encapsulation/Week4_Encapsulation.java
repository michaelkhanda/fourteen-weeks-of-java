/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_encapsulation;

/**
 *
 * @author michaelkhanda
 */
public class Week4_Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Student s1 = new Student();
s1.InputData();
s1.DisplayData();
System.out.println("The student names are: " + s1.getname());
s1.setname("Mike");
s1.DisplayData();

    }
    
}
