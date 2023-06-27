/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6b_classassignment;

/**
 *
 * @author michaelkhanda
 */
public class WeightedItem extends PurchaseItem {
private double weight;


WeightedItem(String name, double unitPrice, double weight)
{
super(name, unitPrice);
this.weight = weight;
}
public double  getweight()
{
return weight;
}
public void setweight()
{
this.weight = weight;
}
@Override
public double getPrice()
{
return weight * super.getPrice();
}
@Override
public String toString(int i)
{
if (i==1)
{
return super.getname()+ " " + "@" +"$" + " " + super.getPrice() +" "+ weight + "KG" + " " + "TOTAL= "+ getPrice();
}
else
return super.toString();

}
}
    

