/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise5;

/**
 *
 * @author michaelkhanda
 */
public abstract class Shape {

private String ShapeName;
private String NumberofDimensions;

public Shape(String ShapeName, String NumberofDimensions)
{
this.ShapeName= ShapeName;
this.NumberofDimensions = NumberofDimensions;
}

    public String getShapeName() {
        return ShapeName;
    }

    public void setShapeName(String ShapeName) {
        this.ShapeName = ShapeName;
    }

    public String getNumberofDimensions() {
        return NumberofDimensions;
    }

    public void setNumberofDimensions(String NumberofDimensions) {
        this.NumberofDimensions = NumberofDimensions;
    }



    
}
