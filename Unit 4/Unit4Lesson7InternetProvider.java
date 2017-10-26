import java.util.Scanner;

public class Unit4Lesson7InternetProvider 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("PLease select either Package A, Package B, or Package C by entering A, B or C");
    System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.");
    System.out.println("Package B: For $14.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.");
    System.out.println("Package C: For $19.95 per month unlimited access is provided");
    String choice =  scan.nextLine();
    System.out.println("Please enter usage: ");
    double hours = scan.nextDouble();
    if (choice.equals("A")) {
      if (hours <= 10) {
        System.out.println("Cost would be: " + 9.95);
      } else {
        System.out.println("Cost would be: $" + (9.95 + 2.00*(hours-10)));
      }
    } else if (choice.equals("B")) {
      if (hours <= 20) {
        System.out.println("Cost would be: " + 14.95);
      } else {
        System.out.println("Cost would be: $" + (14.95 + 1.00*(hours-20)));
      }
    } else {
      System.out.println("Cost would be: " + 19.95);
    }
  }
}