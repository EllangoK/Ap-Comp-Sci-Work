package Breakfast;

import java.util.Scanner;

public class BreakfastClub {
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    Batter batter = new Batter();
    Pancake pancake = new Pancake();
    Waffle waffle = new Waffle();
    Bisquit bisquit = new Bisquit();
    String userInput = "";
    while (!userInput.equals("exit")) {
      System.out.println("Cooking with Claire, press exit to exit, press p for pancake, w for waffle, b for bisquit, s for stock amount, and r to refill");
      userInput = scan.nextLine();
      if (userInput.equals("p")) {
        pancake.makePancake();
        System.out.println(pancake);
      } else if (userInput.equals("w")) {
        waffle.makeWaffle();
        System.out.println(waffle);
      } else if (userInput.equals("b")) {
        bisquit.makeBisquit();
        System.out.println(bisquit);
      } else if (userInput.equals("s")) {
        System.out.println(batter);
      } else if (userInput.equals("r")) {
        batter.setMilk(16);
        batter.setEggs(12);
        batter.setBisquick(96);
        System.out.println(batter);
      } else {
        System.out.println("Exiting");
        break;
      }
    }
  }
}