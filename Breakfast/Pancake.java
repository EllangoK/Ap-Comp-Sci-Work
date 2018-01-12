package Breakfast;

public class Pancake extends Batter {
  public static int amountPancake = 0;
  
  public Pancake (){
    super();
  }
  
  public boolean possibleForPancake(){
    return getMilk() >= 1.0 && getBisquick() >= 2.0 && getEggs() >= 2.0;
  }
  
  public void makePancake() {
    setMilk(getMilk() - 1.0);
    setBisquick(getBisquick() - 2.0);
    setEggs(getEggs() - 2.0);
    amountPancake++;
  }
  
  public int getPancakeAmount(){
    return amountPancake;
  }
  
  public String toString(){
    return "Amount of Pancakes: " + amountPancake;
  }
}