import java.util.Random;
// Author is Karun Ellango, Project 2.2, APCS Period 4, Mr. Burns
public class RandomPhoneNumberGenerator
{
  public static void main (String[] args)
  {
    int num1, num2, num3, block2, block3;
    
    Random generator = new Random();
    num1 = generator.nextInt(8); //Generates first number
    num2 = generator.nextInt(8); //Generates second number
    num3 = generator.nextInt(8); //Generates third number 
    block2 = generator.nextInt(742); //Generates Second Block
    block3 = generator.nextInt(10000); //Generates Third Block
    System.out.println(num1 +""+ num2+""+num3+""+"-"+block2+"-"+block3); //Puts Everything Together
  }
}
