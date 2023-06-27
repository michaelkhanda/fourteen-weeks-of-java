/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public class Square extends TwoDimensionalShape{

private double length;
private double width;

public Square(String ShapeName, String NumberofDimensions, double Area, double length, double width)
{
super(ShapeName, NumberofDimensions,Area);
this.length = length;
this.width = width;
}

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

@Override
public double getArea()
{
return length * width;
}

    
}
