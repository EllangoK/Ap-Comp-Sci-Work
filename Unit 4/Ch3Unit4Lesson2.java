import java.util.Scanner;

public class Ch3Unit4Lesson2
{
  static boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      return true;
    } else {
      return false;
    }
  }
  
  static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile == bSmile) {
      return true;
    } else {
      return false;
    } 
  }

  static int sumDouble(int a, int b) {
    if (a == b) {
      return 2*(a+b);
    } else {
      return a+b;
    }
  }
  
  static boolean cigarParty(int cigars, boolean isWeekend) {
    if ((40 <= cigars && 60 >= cigars) || isWeekend && ((40 <= cigars && 90 >= cigars))) {
      return true;
    } else {
      return false;
    }
  }
  
  static boolean squirrelPlay(int temp, boolean isSummer) {
  if ((60 <= temp && 90 >= temp) || isSummer && ((60 <= temp && 100 >= temp))) {
      return true;
    } else {
      return false;
    }
}
  
  public static void main(String[] args)
  {
    System.out.println(sleepIn(true, true));
    System.out.println(monkeyTrouble(false, false));
    System.out.println(sumDouble(2,2));
    System.out.println(cigarParty(50,true));
  }
}
    