/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public class Triangle extends TwoDimensionalShape {
private double base;
private double height;

public Triangle(String ShapeName, String NumberofDimensions, double Area, double base, double height)
{
super(ShapeName, NumberofDimensions,Area);
this.base = base;
this.height = height;
}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    

@Override
public double getArea()
{
return height * base * 0.5;
}
    
}
