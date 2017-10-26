import java.util.Scanner;

public class DemoRRP
{
  public static void main (String[] args)
  {
    int len, wid, dep;
    RightRectPrism prism = new RightRectPrism();
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Length:");
    prism.setLength(keyboard.nextInt());
    System.out.print("Width:");
    prism.setWidth(keyboard.nextInt());
    System.out.print("Depth:");
    prism.setDepth(keyboard.nextInt());
    System.out.println("Surface area " + prism.getSA());
    System.out.println("Volume " + prism.getVolume());    
  }
}
                        
  