package Breakfast;

public class Batter {
  public Batter(){}
  public static double Bisquick = 96;
  public static double Eggs = 12;
  public static double Milk = 16; //cups in 1 gallon
  
  public double getBisquick(){return Bisquick;}
  public double getEggs(){return Eggs;}
  public double getMilk(){return Milk;}
  public void setBisquick(){this.Bisquick = Bisquick;}
  public void setEggs(int Eggs){this.Eggs = Eggs;}
  public void setMilk(int Milk){this.Milk = Milk;}
}