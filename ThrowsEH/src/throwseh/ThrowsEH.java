/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwseh;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class ThrowsEH {

    /**
     * @param args the command line arguments
     */
    public static void MyDivide() throws ScoreException {
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
    }

    public static void MyAddition() throws ScoreException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        System.out.println("Enter a number");
        int b = s.nextInt();
        if (a < 0 || a > 100 || b < 0 || b > 100) {
            throw new ScoreException("Invalid Score");
        }
        int c = a + b;
        System.out.println("The answer is: " + c);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        boolean repeat = true;
        do {

            try {
                MyDivide();
                MyAddition();
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
