import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[]args){
  int num1, num2;

  Scanner keyboard = new Scanner(System.in);

  System.out.print("What is number 1?");
  num1 = keyboard.nextInt();

  System.out.print("What is number 2?");
  num2 = keyboard.nextInt();

  if (num1 > num2) {
    System.out.print("Number 1 is greater than number 2");
  }

  else if (num2 > num1) {
    System.out.print("Number 2 is greater than number 1");
  }

  else {
    System.out.print("Number 2 is equal to number 1");
  }

  }
}
