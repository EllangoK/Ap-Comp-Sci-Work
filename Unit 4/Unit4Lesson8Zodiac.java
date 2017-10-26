import java.util.Scanner;

public class Unit4Lesson8Zodiac{
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    System.out.print("Enter Month:");
    int month = i.nextInt();
    System.out.print("Enter Days:");
    int day = i.nextInt();
    int numDate = 0;
    String zodiac = "";
    switch (month) {
      case 1:
        numDate = 0 + day; 
        break;
      case 2:
        numDate = 31 + day;
        break;
      case 3:
        numDate = 59 + day;
        break;
      case 4:
        numDate = 90 + day;
        break;
      case 5:
        numDate = 120 + day;
        break;
      case 6:
        numDate = 151 + day;
        break;
      case 7:
        numDate = 181 + day;
        break;
      case 8:
        numDate = 212 + day;
        break;
      case 9:
        numDate = 243 + day;
        break;
      case 10:
        numDate = 273 + day;
        break;
      case 11:
        numDate = 304 + day;
        break;
      case 12:
        numDate = 334 + day;
        break;
      default: 
        System.err.println("Please enter a number between 1-12");
        break;
    }
    if(numDate >=80 && numDate<=110)
    { zodiac = "Aries"; }
    else if(numDate >=111 && numDate<=141)
    { zodiac = "Taurus"; }
    else if(numDate >=142 && numDate<=172)
    { zodiac = "Gemini"; }
    else if(numDate >=173 && numDate<=203)
    { zodiac = "Cancer"; }
    else if(numDate >=204 && numDate<=234)
    { zodiac = "Leo"; }
    else if(numDate >=235 && numDate<=265)
    { zodiac = "Virgo"; }
    else if(numDate >=266 && numDate<=295)
    { zodiac = "Libra"; }
    else if(numDate >=296 && numDate<=325)
    { zodiac = "Scorpio"; }
    else if(numDate >=326 && numDate<=355)
    { zodiac = "Sagittarius"; }
    else if(numDate >=356 || numDate<=19)
    { zodiac = "Capricorn"; }
    else if(numDate >=20 && numDate<=49)
    { zodiac = "Aquarius"; }
    else if(numDate >=50 && numDate<=79)
    { zodiac = "Pisces"; }
    System.out.println("Your zodiac is: " + zodiac);
  }
}
