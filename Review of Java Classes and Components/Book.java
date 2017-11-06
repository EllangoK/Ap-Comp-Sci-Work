public class Book {
 private int numPages;
 private int currentPage;
 
 public void initialize(int page){
  numPages = page;
  currentPage=1;
 }

 public int getNumPages() {
  return numPages;
 }


 public int getCurrentPage() {
  return currentPage;
 }
 
 public void nextPage(){
  if (currentPage < numPages){
   currentPage++;
  }
 }

}