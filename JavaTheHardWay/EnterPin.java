import java.util.Scanner;

public class EnterPin {
  public static void main(String[]args) {
  Scanner keyboard = new Scanner(System.in);
  int pin, entry;
  String password;

  pin = 1234;

  System.out.println("Welcome to Java");

  System.out.println("Enter password: ");
  password = keyboard.next();

  while (! password.equals("java")) {
    System.out.println("\nIncorrect, try again");
    System.out.println("Enter password: ");
    password = keyboard.next();
  }

  System.out.println("Enter pin: ");
  entry = keyboard.nextInt();

  while (entry != pin) {
    System.out.println("\nIncorrect, try again");
    System.out.println("Enter pin: ");
    entry = keyboard.nextInt();
  }

  System.out.println("\nPin accepted");

  }
}
