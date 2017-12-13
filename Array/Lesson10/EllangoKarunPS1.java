import java.awt.Color;

public class EllangoKarunPS1 {
  public static void main(String[] args){
    Color[][] board = new Color[8][8];
    board = fillCheckerboard(board);
    int counter = 2;
    for(int i=0; i<board.length; i++) {
      for(int j=0; j<board[i].length; j++) {
        if (board[i][j] == Color.white) {
          System.out.print("- ");
        } else {
          System.out.print("x ");
        }
      }
      System.out.println();
    }
  }
  
  public static Color[][] fillCheckerboard(Color[][] board) {
    int cntr=0;
    for(int n = 0; n < board.length; n++){
      for(int k = 0; k < board[0].length; k++){
        if((k%2==0 && n%2 ==0)||(k%2==1 && n%2 ==1)){
          board[n][k] = Color.black;
        }
        else{
          board[n][k] = Color.white;
        }
      }
    }  
    return board;
  }
}