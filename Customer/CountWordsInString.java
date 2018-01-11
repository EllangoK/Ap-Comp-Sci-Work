import java.util.Scanner;

public class CountWordsInString {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence");
    System.out.println(countWords(scan.nextLine()));
  }

  public static int countWords(String sentence){
    return sentence.split("\\w+").length;
  }
}