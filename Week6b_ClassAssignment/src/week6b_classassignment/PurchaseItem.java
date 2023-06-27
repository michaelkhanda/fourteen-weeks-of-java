/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6b_classassignment;

/**
 *
 * @author michaelkhanda
 */
public class PurchaseItem {
private String name;
private double unitPrice;
PurchaseItem()
{
name = "No name";
unitPrice = 0;
}
PurchaseItem(String name,double unitPrice)
{
this.name = name;
this.unitPrice = unitPrice;
}
public String getname()
{
return name;
}
public double getPrice()
{
return unitPrice;
}
public void setname(String name)
{
this.name = name;
}
public void setPrice(double unitPrice)
{
this.unitPrice = unitPrice;
}
public String toString(int i)
{
return name + " " + "@" + unitPrice;
}
    
}
