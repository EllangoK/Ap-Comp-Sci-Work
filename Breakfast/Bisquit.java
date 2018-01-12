package Breakfast;

public class Bisquit extends Batter {
  public static int amountBisquit = 0;
  
  public Bisquit (){}
  
  public boolean possibleForBisquit(){
    return getMilk() >= 2.0/3.0 && getBisquick() >= 9.0/4.0;
  }
  
  public void makeBisquit() {
    setMilk(getMilk() - (2.0/3.0));
    setBisquick(getBisquick() - 9.0/4.0);
    amountBisquit++;
  }
  
  public int getBisquitAmount(){
    return amountBisquit;
  }
  
  public String toString(){
    return "Amount of Bisquit: " + amountBisquit;
  }
}