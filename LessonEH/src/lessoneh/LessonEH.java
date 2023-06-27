/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lessoneh;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class LessonEH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean repeat = true;
        do {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a number");
                int a = s.nextInt();
                System.out.println("Enter a number");
                int b = s.nextInt();
                if (a < 0 || a > 100 || b < 0 || b > 100) {
                    throw new ScoreException("Invalid Score");
                }
                int c = a / b;
                System.out.println("The answer is: " + c);
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("You must provide integers only!");
                System.out.println("Error type" + e);
            } catch (ArithmeticException e) {
                System.out.println("Denominator cannot be zero!");
                System.out.println("Error type" + e);
            } catch (ScoreException e) {
                System.out.println("Error type " + e);
            } finally {
                System.out.println("This code executes to release resourcess.");
            }

        } while (repeat);

    }

}
