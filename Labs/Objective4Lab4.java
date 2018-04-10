import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int num1;

    System.out.println("What is your number");
    num1 = keyboard.nextInt();

    if(num1%2==0){
      System.out.println("Your number is EVEN");
    }

    else {
      System.out.println("Your number is ODD");
    }

    }
}
