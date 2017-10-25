import java.util.Scanner;

public class Unit4Lesson8Zodiac{
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    System.out.print("Enter Month:");
    int month = i.nextInt();
    System.out.print("Enter Days:");
    int day = i.nextInt();
    String monthString;
    switch (month) {
      case 1:  
        break;
      case 2:  
        monthString = "February";
      break;
      case 3:  monthString = "March";
      break;
      case 4:  monthString = "April";
      break;
      case 5:  monthString = "May";
      break;
      case 6:  monthString = "June";
      break;
      case 7:  monthString = "July";
      break;
      case 8:  monthString = "August";
      break;
      case 9:  monthString = "September";
      break;
      case 10: monthString = "October";
      break;
      case 11: monthString = "November";
      break;
      case 12: monthString = "December";
      break;
      default: monthString = "Invalid month";
      break;
    }
  }
}