/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessoninterfaces;

/**
 *
 * @author michaelkhanda
 */
public class Invoice implements Payable{
    private String iName;
private int quantity;
private double pricePerItem;

public Invoice( String n, int count, double price )
 { iName = n;
 quantity= count; 
 pricePerItem= price ; 
 }
 public void setName( String n )
 { iName = n; 
 } 
 public String getName()
 { return iName;
 } 
public void setQuantity( int count )
 { quantity = count;
 } 
 public int getQuantity()
 { return quantity;
 } 
 public void setPricePerItem( double price )
 {  pricePerItem = price;
  } 
  public double getPricePerItem()
 { return pricePerItem;
 }
  @Override
public double getPaymentAmount()
{return getQuantity() * getPricePerItem(); // calculate total cost
}
}
