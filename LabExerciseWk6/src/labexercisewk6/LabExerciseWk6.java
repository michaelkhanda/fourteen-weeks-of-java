/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexercisewk6;

/**
 *
 * @author michaelkhanda
 */
public class LabExerciseWk6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

CarbonFootprint Bu1 = new Building("Qwetu", 4000);
CarbonFootprint C1 = new Car("XTRAIL", 5845, 20);
CarbonFootprint by1 = new Bicycle ("HONDA", 200);

System.out.println(Bu1.toString() + "\n Carbon footprint: " + Bu1.getCarbonFootprint());
System.out.println(C1.toString() + "\n Carbon footprint: " + C1.getCarbonFootprint());
System.out.println(by1.toString() + "\n Carbon footprint: " + by1.getCarbonFootprint());
    }
    
}
