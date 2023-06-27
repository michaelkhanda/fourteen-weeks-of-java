/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6_arrays;

/**
 *
 * @author michaelkhanda
 */
public class Week6_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
Student[] s1 = new Student[3];
for(int i =0; i<s1.length; i++)
{
s1[i] = new Student();
s1[i].InputData();
s1[i].DisplayData();
}
    }
    
}
