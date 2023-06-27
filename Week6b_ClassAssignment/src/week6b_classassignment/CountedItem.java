/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6b_classassignment;

/**
 *
 * @author michaelkhanda
 */
public class CountedItem extends PurchaseItem {
private int quantity;

CountedItem(String name, double unitPrice, int quantity)
{
super(name, unitPrice);
this.quantity = quantity;
}
public double  getquantity()
{
return quantity;
}
public void setquantity()
{
this.quantity = quantity;
}
@Override
public double getPrice()
{
return quantity* super.getPrice();
}
@Override
public String toString(int i)
{
if(i==2)
{
return super.getname()+ " " + "@" + "$" + super.getPrice() +" " + quantity +  "UNITS" + " " + "TOTAL= "+ getPrice();
}
else
return super.toString();
}
    
}
