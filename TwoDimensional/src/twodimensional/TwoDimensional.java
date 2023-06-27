/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodimensional;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class TwoDimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner s = new Scanner(System.in);
String[][] Student = new String [1][3];
for (int r = 0; r < 1; r++)
            {
                System.out.println("Enter a name and two scores:");
                for (int c = 0; c < 3; c++)
                {
                    Student[r][c] = s.nextLine();
                }   
            }
System.out.println("Student Name " + "\t" + "Test One" + "\t" + "Test Two" + "\t" + "Average");
            System.out.println("-------------------------------------------------------------------");

 int total1 = 0, total2 = 0;
            for (int r = 0; r < 1; r++)
            {
               
                for (int c = 0; c < 3; c++)
                {
                    System.out.print(Student[r][c] + "\t\t" );

                }
                int total = (Integer.parseInt(Student[r][1])) + (Integer.parseInt(Student[r][2]));
                System.out.print(total / 2);
                System.out.println();

                total1 = total1 + (Integer.parseInt(Student[r] [1]));
                total2 = total2 + (Integer.parseInt(Student[r] [2]));

            }
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Total" + "\t\t" + total1 + "\t\t" + total2 );
    }
    
}
