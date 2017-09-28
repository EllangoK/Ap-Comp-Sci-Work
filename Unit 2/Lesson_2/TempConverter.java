package Lesson_2;

import java.util.Scanner;

public class TempConverter {

 public static void main(String[] args){
  // TODO Auto-generated method stub
  double f;
  Scanner keyboard = new Scanner(System.in);
  System.out.print("Please enter temperature in Fahrenheit : ");
        f = keyboard.nextDouble();
        double celsius = (5.0/9.0) * (f - 32);
        System.out.println("Temperature in Celsius is : "+celsius);

 }

}
