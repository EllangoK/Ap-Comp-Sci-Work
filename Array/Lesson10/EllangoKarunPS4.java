import java.util.Scanner;

public class EllangoKarunPS4{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[][] pascal;
    pascal = pascalTriangle(scan.nextInt());
  }
  
  public static int[][] pascalTriangle(int n){
    int[][] PascalTriangle=new int[n+1][];
    
    PascalTriangle[1] = new int[1+2];
    PascalTriangle[1][1] = 1;
    
    for (int i = 2; i <= n; i++) {
      PascalTriangle[i] = new int[i+2];
      for (int j = 1; j < PascalTriangle[i].length - 1; j++)
        PascalTriangle[i][j] = PascalTriangle[i-1][j-1] + PascalTriangle[i-1][j];
    }
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < PascalTriangle[i].length - 1; j++) {
        System.out.print(PascalTriangle[i][j] + " ");
      }
      System.out.println();
    }
    return PascalTriangle;
  }
}