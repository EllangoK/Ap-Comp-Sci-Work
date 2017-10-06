import java.util.Scanner;
// Author is Karun Ellango, Project 2.1, APCS Period 4, Mr. Burns
public class AreaOfCoordTriangle
{
  public static void main(String[] args)
  {
    double x1, y1, x2, y2, x3, y3, side1, side2, side3, semiPerimeter, area;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter first coordinates of the triangle (x1, y1).");
    x1 = keyboard.nextDouble(); //gets x1
    y1 = keyboard.nextDouble(); //gets y1
    System.out.println("Enter second coordinates of the triangle (x2, y2).");
    x2 = keyboard.nextDouble(); //gets x2
    y2 = keyboard.nextDouble(); //gets y2
    System.out.println("Enter third coordinates of the triangle (x3, y3).");
    x3 = keyboard.nextDouble(); //gets x1
    y3 = keyboard.nextDouble(); //gets y1
    side1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))); // Distance Formula
    side2 = Math.sqrt((Math.pow((x3 - x2), 2)) + (Math.pow((y3 - y2), 2))); // Distance Formula
    side3 = Math.sqrt((Math.pow((x3 - x1), 2)) + (Math.pow((y3 - y1), 2))); // Distance Formula
    semiPerimeter = (side1 + side2 + side3)/2; // Semiperimeter
    area = Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3)); //Heron's Formula
    area = Math.round(area * 10.0) / 10.0; //Rounds
    System.out.println("The area is: " + area);
  }
}
    