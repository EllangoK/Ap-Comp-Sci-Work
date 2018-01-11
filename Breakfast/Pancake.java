package Breakfast;

public class Pancake extends Batter {
  public static int amountPancake = 0;
  
  public Pancake (){}
  
  public boolean possibleForPancake(){
    return BreakfastClub.batter.getMilk >= 2/3 && BreakfastClub.batter.getBisquick >= 9/4;
  }
  
  public void makePancake() {
    BreakfastClub.batter.setMilk(BreakfastClub.batter.getMilk - 2/3);
    BreakfastClub.batter.setBisquick(BreakfastClub.batter.getBisquick - 1);
    BreakfastClub.batter.setEggs(BreakfastClub.batter.getEggs - 2);
    amountPancake++;
  }
}