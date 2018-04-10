import static java.lang.System.*;
import java.util.Scanner;

public class GenderTitles {
  public static void main(String[]args) {
  Scanner keyboard = new Scanner(System.in);
  String title, first, last, gender, married;
  int age;

  out.print( "First name: " );
  first = keyboard.next();

  out.print( "Last name: " );
  last = keyboard.next();

  out.print( "Gender (M/F): " );
  gender = keyboard.next();

  out.print( "Age: " );
  age = keyboard.nextInt();

  if (age < 20) {
    title = first;
  }

  else {
    if (gender.equals("F")){
      out.print("Are you married, " + first + "? (Y/N): ");
      married = keyboard.next();

      if (married.equals("Y")) {
        title = "Mrs";
      }
      else {
        title = "Ms";
      }
      }

      else {
        title = "Mr";
      }
    }

    out.println("\n" + title + " " + last);

  }
}
