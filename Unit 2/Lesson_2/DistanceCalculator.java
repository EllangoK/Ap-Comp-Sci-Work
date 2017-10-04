import java.util.Scanner;
// Author is Karun Ellango, Project 2.1, APCS Period 4, Mr. Burns
public class DistanceCalculator
{
  public static void main (String[] args)
  {
    double x1, y1, x2, y2, output;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter first coordinates (x1, y1). Inclusive 0-10");
    x1 = keyboard.nextDouble(); //gets x1
    y1 = keyboard.nextDouble(); //gets y1
    System.out.println("Enter second coordinates (x2, y2). Inclusive 0-10");
    x2 = keyboard.nextDouble(); //gets x2
    y2 = keyboard.nextDouble(); //gets y2
    output = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))); // Distance Formula
    output = Math.round(output * 100.0) / 100.0; //Rounds
    System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + output); //Outputs
    keyboard.close(); //Closes scanner
  }
}
