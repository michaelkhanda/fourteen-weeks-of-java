/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polylesson;

/**
 *
 * @author michaelkhanda
 */
public class PolyLesson {

    /**
     * @param args the command line arguments
     */
public static void Calculate(int a, int b)
{
System.out.println(a+b);
}
public static void Calculate(int a)
{
System.out.println(a*a);
}
    public static void main(String[] args) {
        // TODO code application logic here
int a = 3, b = 4;
Calculate(a,b);
Calculate(a);
    }
    
}
