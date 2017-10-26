import java.util.Scanner;

public class Unit4Lesson7DoNow {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter currrent salary");
    double salary = scan.nextInt();
    if (salary >= 50000) {
      System.out.println("Please enter years at current job");
      double years = scan.nextInt();
        if (years >= 2){
        System.out.println("You qualify for a loan"); 
      } else {
        System.out.println("You must atleast work two years on the job");
      }
    } else {
      System.out.println("You must earn atleast $50,000 per year to qualify");
    }
  }
}