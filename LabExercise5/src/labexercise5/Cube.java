/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public class Cube extends ThreeDimensionalShape {

private double length;

public Cube(String ShapeName, String NumberofDimensions, double Area, double Volume, double length)
{
super(ShapeName, NumberofDimensions, Area, Volume);
this.length = length;
}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
@Override
public double getVolume() {
        return length * length * length ;
    }


    
}
