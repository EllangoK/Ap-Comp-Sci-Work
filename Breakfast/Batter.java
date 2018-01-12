package Breakfast;

public class Batter {
  public Batter(){}
  private static double Bisquick = 96;
  private static double Eggs = 12;
  private static double Milk = 16; //cups in 1 gallon
  
  public double getBisquick(){return Bisquick;}
  public double getEggs(){return Eggs;}
  public double getMilk(){return Milk;}
  public void setBisquick(double Bisquick){this.Bisquick = Bisquick;}
  public void setEggs(double Eggs){this.Eggs = Eggs;}
  public void setMilk(double Milk){this.Milk = Milk;}
  
  public String toString() {
    return "Amount of Eggs: " + this.Eggs + "\nAmount of Milk: " + this.Milk + "\nAmount of Bisquick: " + this.Bisquick;
  }
}