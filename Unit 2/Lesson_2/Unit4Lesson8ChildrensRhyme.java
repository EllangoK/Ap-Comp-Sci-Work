import java.util.Scanner;
public class Unit4Lesson8ChildrensRhyme {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number 1 – 10");
    int input = scan.nextInt();
    switch (input) {
      case 1:
      case 2:
      System.out.println("Buckle my shoe;");
      break;
      case 3:
      case 4:
      System.out.println("Knock at the door;");
      break;
      case 5:
      case 6:
      System.out.println("Pick up sticks;");
      break;
      case 7:
      case 8:
      System.out.println("Lay them straight:");
      break;
      case 9:
      case 10:
      System.out.println("A big fat hen;");
      break;
      default:
      System.err.println("Enter a number between 1-10");
    }
  }
}