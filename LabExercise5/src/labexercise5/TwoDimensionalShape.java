/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public class TwoDimensionalShape extends Shape {

private double Area;
public TwoDimensionalShape(String ShapeName, String NumberofDimensions, double Area)
{
super(ShapeName,NumberofDimensions);
this.Area = Area;
}

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    
}
