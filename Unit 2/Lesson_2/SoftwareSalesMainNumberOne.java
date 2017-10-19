import java.util.Scanner;

public class SoftwareSalesMainNumberOne 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter amount of packages that will be purchased");
    double packages = scan.nextDouble();
    if (packages >= 10 && packages <= 19) {
      System.out.println("The discount is 20%");
      System.out.println("The price is : $" + packages*99*0.80);
    } else if (packages >= 20 && packages <= 49) {
      System.out.println("The discount is 30%");
      System.out.println("The price is : $" + packages*99*0.70);
    } else if (packages >= 50 && packages <= 99) {
      System.out.println("The discount is 40%");
      System.out.println("The price is : $" + packages*99*0.60);
    } else if (packages >= 100) {
      System.out.println("The discount is 50%");
      System.out.println("The price is : $" + packages*99*0.50);
    } else {
      System.out.println("The price is : $" + packages*99);
    }
  }
}
          