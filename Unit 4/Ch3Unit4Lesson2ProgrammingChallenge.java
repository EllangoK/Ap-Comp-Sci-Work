import java.util.Scanner;

public class Ch3Unit4Lesson2ProgrammingChallenge {
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a medium of air, water or steel");
    String chooser = scan.nextLine();
    if (chooser.equals("air")) {
      System.out.println("Please enter the distance that the sound will travel");
      double distance = scan.nextInt();
      System.out.println("It will take: " + distance/1100 + " seconds");
    } else if (chooser.equals("water")) {
      System.out.println("Please enter the distance that the sound will travel");
      double distance = scan.nextInt();
      System.out.println("It will take: " + distance/4900 + " seconds");
    } else if (chooser.equals("steel")) {
      System.out.println("Please enter the distance that the sound will travel");
      double distance = scan.nextInt();
      System.out.println("It will take: " + distance/16400 + " seconds");
    } else {
      System.out.println("Please enter a valid medium");
    }
  }
}