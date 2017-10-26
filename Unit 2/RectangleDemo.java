import java.util.Scanner;
public class RectangleDemo {
  
  public static void main(String[] args){
    
    int myLength, myWidth;
    int myArea;
    int cost;
    
    Scanner scan = new Scanner(System.in);
    Rectangle livingroom = new Rectangle();
    Rectangle bedroom = new Rectangle();
    Rectangle hallway = new Rectangle();
    
    System.out.println("Please enter the cost per square foot: ");
    cost = (scan.nextInt());
    livingroom.setCost(cost);
    bedroom.setCost(cost);
    hallway.setCost(cost);
    
    System.out.println("Please enter the length and width of the living room: ");
    livingroom.setLength(scan.nextInt());
    livingroom.setWidth(scan.nextInt());
    
    System.out.println("Please enter the length and width of the bedroom: ");
    bedroom.setLength(scan.nextInt());
    bedroom.setWidth(scan.nextInt());
    
    System.out.println("Please enter the length and width of the hallway: ");
    hallway.setLength(scan.nextInt());
    hallway.setWidth(scan.nextInt());
    
    System.out.println("The area of the living room is " + livingroom.getArea() + " and the cost is $" + livingroom.getTotalCost());
    System.out.println("The area of the bedroom is " + bedroom.getArea() + " and the cost is $" + bedroom.getTotalCost());
    System.out.println("The area of the hallway is " + hallway.getArea() + " and the cost is $" + hallway.getTotalCost());
    
  }
}                          
                 