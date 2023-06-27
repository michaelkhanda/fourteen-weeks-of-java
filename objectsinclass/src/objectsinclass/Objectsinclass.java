/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsinclass;

/**
 *
 * @author michaelkhanda
 */
public class Objectsinclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Students s1 = new Students();
Faculty g1 = new Faculty();

s1.inputdata();
s1.display();
g1.grade(s1);
    }
    
}
