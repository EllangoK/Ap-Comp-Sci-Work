import java.util.Scanner;

public class TwoDFourByFour {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[][] arrayOne = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int[][] arraytWO = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  }
  
  public static double getTotal(double[][] array) {
    double total = 0;
    
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[row].length; col++) {
        total += array[row][col];
      }
    }
    
    return total;
  }
  
  public static double getAverage(double[][] array) {
    return getTotal(array) / getElementCount(array);
  }
  
  public static double getRowTotal(double[][] array, int row) {
    double total = 0;
    
    for (int col = 0; col < array[row].length; col++) {
      total += array[row][col];
    }
    
    return total;
  }
}