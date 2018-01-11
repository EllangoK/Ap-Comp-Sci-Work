public class EllangoKarunPS5 {
  public static void main(String[] args){
    int n = 37, b = 2, p = 1;
    while (p <= n) {
      n = n - p;
      p = p * b;
    }
    System.out.println(n);
  }
}