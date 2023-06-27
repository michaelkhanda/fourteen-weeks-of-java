/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisewk6;

/**
 *
 * @author michaelkhanda
 */
public class Car implements CarbonFootprint{

private String CarName;
private double CarTotalMiles;
private double CarMPG;
private final double C02 = 9;

public Car(String name, double miles, double MPG)
{
this.CarName = name;
this.CarTotalMiles = miles;
this.CarMPG = MPG;
} 

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public double getCarTotalMiles() {
        return CarTotalMiles;
    }

    public void setCarTotalMiles(double CarTotalMiles) {
        this.CarTotalMiles = CarTotalMiles;
    }

    public double getCarMPG() {
        return CarMPG;
    }

    public void setCarMPG(double CarMPG) {
        this.CarMPG = CarMPG;
    }

    public double getC02() {
        return C02;
    }

@Override
public String toString()
{
return "The car name is " + getCarName() + "\n Total miles is " + getCarTotalMiles() + "\n Average MPG is " + getCarMPG() ;
}


@Override
public double getCarbonFootprint() {
return CarTotalMiles * CarMPG * C02;
}
}
