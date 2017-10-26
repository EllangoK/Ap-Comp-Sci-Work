import java.util.Scanner;

public class Unit4Lesson6ProgrammingChallenge
{
  static String alarmClock (int day, boolean vacation) {
    if (vacation) {
      if (day == 0 || day == 6) {
        return "Off";
      } else {
        return "10:00";
      }
    } else {
      if (day == 0 || day == 6) {
        return "10:00";
      } else {
        return "7:00";
      }    
    }
  }

  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a day of the week as an int 0-Sun, 6-Sat");
    int day = scan.nextInt();
    System.out.println("Are you on a vacation true or false");
    boolean vacation = scan.nextBoolean();
    System.out.println("Set Alarm Clock to: " + alarmClock(day, vacation));
  }
}
