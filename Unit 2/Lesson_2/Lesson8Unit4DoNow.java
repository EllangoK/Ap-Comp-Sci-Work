import java.util.Scanner;

public class Lesson8Unit4DoNow {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number from 1-10, and it will be translated into German");
    int german = scan.nextInt();
    if (german == 1) {
      System.out.println("Eins");
    } else if (german == 2) {
      System.out.println("Zwei");
    } else if (german == 3) {
      System.out.println("Drei");
    } else if (german == 4) {
      System.out.println("Vier");
    } else if (german == 5) {
      System.out.println("Fünf");
    } else if (german == 6) {
      System.out.println("Sechs");
    } else if (german == 7) {
      System.out.println("Sieben");
    } else if (german == 8) {
      System.out.println("Acht");
    } else if (german == 9) {
      System.out.println("Neun");
    } else if (german == 10) {
      System.out.println("Zehn");
    } else {
      System.err.println("Error please enter a number between 1-10");
    }
  }
}