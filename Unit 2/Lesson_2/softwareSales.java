public class softwareSales
{
  public static double getCost(int amount) {
    if (amount >= 10 && amount <= 19) {
      return amount*99*0.80;
    } else if (amount >= 20 && amount <= 49) {
      return amount*99*0.70;
    } else if (amount >= 50 && amount <= 99) {
      return amount*99*0.60;
    } else if (amount >= 100) {
      return amount*99*0.50;
    } else {
      return amount*99;
    }
  }

  public static void main(String[] args)
  {
    System.out.println(getCost(4));
  }
}