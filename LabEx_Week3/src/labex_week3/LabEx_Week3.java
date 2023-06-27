/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labex_week3;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class LabEx_Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner s = new Scanner(System.in);
String answer;
String Instructor;
System.out.println("Would you like to create a:\n1.Instructor \n2.Course");
System.out.println("How many would you like to create?");
        int numberofinstances = s.nextInt();
        
        for(int i = 0; i < numberofinstances; i++ ){

            if (answer.equals("1")){
                System.out.println("Name");
                String name = s.next();
                System.out.println("Course code");
                String coursecode = s.next();

                Instructor i1 = new Instructor(name,coursecode);
                i1.display_data();
            } 
            else if(answer.equals("2")){
                System.out.println("Name");
                String name = s.next();
                System.out.println("Course code");
                String coursecode = s.next();
                System.out.println("Course department");
                String coursedepartment = s.next();


                 Course c1 = new Course(name,coursecode,coursedepartment);
                 c1.display_data();
            }
        } 
    }
    
}
