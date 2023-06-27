/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsinclass;

import java.util.Scanner;

/**
 *
 * @author michaelkhanda
 */
public class Faculty {
private int score;

public void grade(Students st)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a score: ");
score = s.nextInt();
st.display();

if(score > 59)

System.out.println("PASS");

else

System.out.println("FAIL");




}
    
public void Display()
{
System.out.println("The score is " + score);
}
}
