import java.util.Scanner;

public class EllangoKarunPS2 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(computeScore(scan.nextLine()));
  }
  
  public static int computeScore(String word) {
    String scoreBoard = "abcdefghijklmnopqrstuvwxyz";
    int[] scores = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    int score = 0;
    for (int i = 0; i < word.length(); i++) {
      score += scores[scoreBoard.indexOf(word.charAt(i))];
    }
    return score;
  }
}