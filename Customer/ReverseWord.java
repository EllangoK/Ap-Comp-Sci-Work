import java.util.Scanner;

public class ReverseWord {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word to be reversed");
    System.out.println(reverse(scan.nextLine()));
  }
  
  public static String reverse(String word){
    return new StringBuffer(word).reverse().toString();
  }
}