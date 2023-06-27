/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexercisesix;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class LabExerciseSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String[][] Employee = new String[5][2];

        for (int r = 0; r < 5; r++) {
            System.out.println("Enter a salary and Job Grade");
            for (int c = 0; c < 2; c++) {
                Employee[r][c] = s.nextLine();
            }
        }
        System.out.println("Job Grade" + "\t" + "Salary");
for (int r = 0; r < 5; r++) {
            
            for (int c = 0; c < 2; c++) {
                System.out.print(Employee[r][c] + "\t\t");
            }
        }
    }


}
