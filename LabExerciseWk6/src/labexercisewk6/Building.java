/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercisewk6;

/**
 *
 * @author michaelkhanda
 */
public class Building implements CarbonFootprint {

private String BuildingName;
private double monthlyKwh;
private final int months = 12;

public Building(String name, double monthlyConsumption)
{
this.BuildingName = name;
this.monthlyKwh = monthlyConsumption;

 
}

    public String getBuildingName() {
        return BuildingName;
    }

    public void setBuildingName(String BuildingName) {
        this.BuildingName = BuildingName;
    }

    public double getMonthlyKwh() {
        return monthlyKwh;
    }

    public void setMonthlyKwh(double monthlyKwh) {
        this.monthlyKwh = monthlyKwh;
    }

@Override
public String toString()
{
return "The building name is " + getBuildingName() + "\n The monthly consumption is " + getMonthlyKwh();
}

@Override
public double getCarbonFootprint()
{
return getMonthlyKwh() * months;
}
  
}
