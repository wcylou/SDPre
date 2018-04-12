import java.util.Scanner;

public class RunningTotal {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.println("Type in values and I'll add them up");
    current = keyboard.nextInt();

    while (current != 0 ) {
      System.out.print("value: ");
      current = keyboard.nextInt();
      total += current;
      if (current != 0)
      System.out.println("The total so far is: " + total);
    }

      System.out.println("The final total is: " + total);

  }
}
