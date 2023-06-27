/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6b_classassignment;

/**
 *
 * @author michaelkhanda
 */
public class Week6b_ClassAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
PurchaseItem p1 = new WeightedItem("BANANA",3.00,1.37);
PurchaseItem p2 = new CountedItem("PEAS",4.5,10);


System.out.println(p1.toString(1));
System.out.println(p2.toString(2));



    }
    
}
