import java.util.Scanner;  // Needed for the Scanner class

public class MilesToKilometers
{
   public static void main(String[] args)
   {
      double miles;   // To hold the miles

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      // Get the miles.
      System.out.print("Enter the number of miles ");
      miles = keyboard.nextInt();

      // Convert miles to kilometers
      float kilometers = miles * 1.609344;


      // Display the information back to the user.
      System.out.println(miles + "miles is equal to " + kilometers + "kilometers ");
   }
} 