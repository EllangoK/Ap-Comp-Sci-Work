import java.util.Random;
// Author is Karun Ellango, Project 2.2, APCS Period 4, Mr. Burns
public class RandomPhoneNumberGenerator
{
  public static void main (String[] args)
  {
    int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    
    Random generator = new Random();
    // First Block
    num1 = generator.nextInt(8); //Generates first number
    num2 = generator.nextInt(8); //Generates second number
    num3 = generator.nextInt(8); //Generates third number 
    // Second Block
    num4 = generator.nextInt(7); //Generates fourth number
    num5 = generator.nextInt(4); //Generates fifth number
    num6 = generator.nextInt(2); //Generates sixth number 
    // Third Block
    num7 = generator.nextInt(10); //Generates seventh number
    num8 = generator.nextInt(10); //Generates eight number
    num9 = generator.nextInt(10); //Generates ninth number 
    num10 = generator.nextInt(10); //Generates tenth number 
    
    String firstSection = num1 + "" + num2 + "" + num3; //Convenience
    String secondSection = num4 + "" + num5 + "" + num6; //Convenience
    String thirdSection = num7 + "" + num8 + "" + num9 + "" + num10; //Convenience
    
    System.out.println(firstSection + "-" + secondSection + "-" + thirdSection); //Puts Everything Together
  }
}
