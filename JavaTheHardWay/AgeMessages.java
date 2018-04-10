import java.util.Scanner;

public class AgeMessages {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print("How old are you?");
    age = keyboard.nextInt();

    System.out.println("You are: " + age);

    if (age < 13) {
      System.out.println("\ttoo young to get a FB acc");
    }

    if (age < 18) {
      System.out.println("\ttoo young to drink");
    }

    if (age < 35) {
      System.out.println("\ttoo young to run for President");
    }

    if (age > 65) {
      System.out.println("\tyou are old enough to retire");
    }

    }
  }
