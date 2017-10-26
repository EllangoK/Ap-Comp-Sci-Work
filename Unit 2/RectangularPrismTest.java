import java.util.Scanner;

public class RectangularPrismTest
{
  public static void main(String[] args)
  {
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter the Length");
double len = keyboard.nextDouble();
System.out.print("Enter the Width");
double wid = keyboard.nextDouble();
System.out.print("Enter the Depth");
double dep = keyboard.nextDouble();
RectangularPrism prism = new RectangularPrism(len, wid, dep);
System.out.println("Volume: " + prism.getVolume());
}
}