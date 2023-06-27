/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public class Sphere extends ThreeDimensionalShape {

private double radius;

public Sphere(String ShapeName, String NumberofDimensions, double Area, double Volume, double radius)
{
super(ShapeName, NumberofDimensions, Area, Volume);
this.radius = radius;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

@Override
public double getVolume()
{
        return super.getVolume();
    }
    
}
