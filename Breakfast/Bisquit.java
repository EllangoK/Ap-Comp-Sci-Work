package Breakfast;

public class Bisquit extends Batter {
  public static int amountBisquit = 0;
  
  public Bisquit (){}
  
  public boolean possibleForBisquit(){
    return BreakfastClub.batter.getMilk() >= 2/3 && BreakfastClub.batter.getBisquick() >= 9/4;
  }
  
  public void makeBisquit() {
    BreakfastClub.batter.setMilk(BreakfastClub.batter.getMilk() - (2/3));
    BreakfastClub.batter.setBisquick(BreakfastClub.batter.getBisquick() - 9/4);
    amountBisquit++;
  }
}