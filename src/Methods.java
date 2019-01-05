import java.util.Random;

public class Methods {

  public static int calculateSquare(int n) {
    if (n == 0 || n == 1)
      return n;
    int i = 1;
    int result = 1;

    while (result <= n) {
      i++;
      result = i * i;
    }
    return i - 1;
  }

  public static int calculateSquareRoot(int n) {
    return (int) Math.sqrt(n);
  }

  public static String toLowerCase(String str) {
    return str.toLowerCase();
  }

  public static boolean ismultiple(int x, int y) {
    if (x % y == 0 || x % y == 1) {
      return true;
    } else {
      return false;
    }
  }

  public static void String prettyInteger(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
    System.out.println(n);
    for (int i = 0; i< n; i++) {
      System.out.print("*");
    }

    public static int getRandomNumber ( int min, int max){
      if (min >= max) {
        throw new IllegalArgumentException("max must be greater than min");
      }
      Random r = new Random();
      int n = r.nextInt((max - min) + 1) + min;
    }
  }


    public static void main (String args[]){

    }
}
