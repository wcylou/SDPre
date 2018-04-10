import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = keyboard.nextInt();

    if(userNum > 0) {
      System.out.println("Number is POSITIVE");
    }

    else if (userNum <0) {
      System.out.println("Number is NEGATIVE");
    }

    else {
      System.out.println("Number is ZERO");
    }

  }
}
