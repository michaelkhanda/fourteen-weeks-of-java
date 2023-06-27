/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public abstract class ThreeDimensionalShape extends Shape {
private double Area, Volume;
public ThreeDimensionalShape(String ShapeName, String NumberofDimensions, double Area, double Volume)
{
super(ShapeName,NumberofDimensions);
this.Area = Area;
this.Volume = Volume;
}

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double Volume) {
        this.Volume = Volume;
    }
    
}
