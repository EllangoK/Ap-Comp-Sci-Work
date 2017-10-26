import java.util.Scanner;

public class Unit4Lesson7Grades {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int score = scan.nextInt();
    String grade;
    if (score >=90){
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70){
      grade = "C";
    } else if (score >= 60){
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println("Your grade is: " + grade);   
  }
}