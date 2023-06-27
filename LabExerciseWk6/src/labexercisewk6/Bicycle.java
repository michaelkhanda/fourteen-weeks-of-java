/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisewk6;

/**
 *
 * @author michaelkhanda
 */
public class Bicycle implements CarbonFootprint{

private String BikeName;
private double BikeMiles;
private final double CaloriesPerMile = 30;

public Bicycle(String name, double miles)
{
this.BikeName = name;
this.BikeMiles = miles;


}

    public String getBikeName() {
        return BikeName;
    }

    public void setBikeName(String BikeName) {
        this.BikeName = BikeName;
    }

    public double getBikeMiles() {
        return BikeMiles;
    }

    public void setBikeMiles(double BikeMiles) {
        this.BikeMiles = BikeMiles;


    }

    public double getCaloriesPerMile() {
        return CaloriesPerMile;
    }


@Override
public String toString()
{
return "The bicycle name is " + getBikeName() + "\n The yearly miles are " + getBikeMiles() ;
}
@Override
public double getCarbonFootprint() {
return BikeMiles * CaloriesPerMile;
}

    
}
