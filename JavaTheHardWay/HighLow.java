import java.util.Scanner;

public class HighLow {
  public static void main(String[]args){
  Scanner keyboard = new Scanner(System.in);
  int secret, guess;

  secret = 1 + (int)(100*Math.random());

  System.out.println("I'm thinking of a number between 1-100");
  System.out.println("Guess");
  System.out.println("> ");
  guess = keyboard.nextInt();

  while (secret != guess) {
    if (guess < secret) {
      System.out.println("Sorry, too low try again");
    }
    if (guess > secret) {
      System.out.println("Sorry, too high try again");
    }
    guess = keyboard.nextInt();
  }

  System.out.println("Correct");

  }
}
