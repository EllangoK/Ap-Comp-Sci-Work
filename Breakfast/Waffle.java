package Breakfast;

public class Waffle extends Batter {
  public Waffle (){
    super();
  }
  public static int amountWaffle = 0;
  
  public boolean possibleForWaffle(){
    return getMilk() >= 4.0/3.0 && getBisquick() >= 2.0 && getEggs() >= 1.0;
  }
  
  public void makeWaffle() {
    setMilk(getMilk() - (4.0/3.0));
    setBisquick(getBisquick() - 2.0);
    setEggs(getEggs() - 1);
    amountWaffle++;
  }
  
  public int getWaffleAmount(){
    return amountWaffle;
  }
  
  public String toString(){
    return "Amount of Waffles: " + amountWaffle;
  }
}