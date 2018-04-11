public class RandomNumbers {
  public static void main(String[]args) {
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.33) {
      System.out.println("Rock");
    }

    else if(rps > 0.66) {
      System.out.println("Paper");
    }

    else {
      System.out.println("Scissors");
    }
  }
}
