/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessoneh;

/**
 *
 * @author michaelkhanda
 */
public class ScoreException extends Exception {
ScoreException()
{
super("Invalid Score.Try Again!");
}
ScoreException(String x)
{
super(x);
}
    
}
