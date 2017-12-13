import java.util.Arrays;
import java.util.Scanner;

public class EllangoKarunPS3 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println(Arrays.toString(makePythagoreanTriple(scan.nextInt(), scan.nextInt())));
  }
  
  public static int[] makePythagoreanTriple (int m, int n){
    if (m < n){
      int m2 = m;
      m = n;
      n = m2;
    }
    int a = (m*m) - (n*n);
    int b = 2*m*n;
    int c = (m*m) + (n*n);
    return new int[]{a,b,c};
  }
}