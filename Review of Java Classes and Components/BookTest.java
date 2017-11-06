public class BookTest {
 
 public static void main(String[] args){
  Book twilight = new Book();
  twilight.initialize(3);
  for(int i=0; i<3; i++){
   System.out.println("The current page is:" + twilight.getCurrentPage());
   twilight.nextPage();
   
  }
 }
}