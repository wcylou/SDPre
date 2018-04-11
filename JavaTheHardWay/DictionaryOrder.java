import java.util.Scanner;

public class DictionaryOrder {
  public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print("Make up a language: ");
    name = keyboard.nextLine();

    if (name.compareToIgnoreCase("Go") < 0)
      System.out.println(name + " comes before Go");
    if (name.compareToIgnoreCase("Go") == 0 )
      System.out.println("Go isn't a made up language");
    if (name.compareToIgnoreCase("Go") > 0)
      System.out.println(name + " comes after Go");

    if (name.compareToIgnoreCase("Ruby") < 0)
      System.out.println(name + " comes before Ruby");
    if (name.compareToIgnoreCase("Ruby") == 0 )
      System.out.println("Ruby isn't a made up language");
    if (name.compareToIgnoreCase("Ruby") > 0)
      System.out.println(name + " comes after Ruby");

    if (name.compareToIgnoreCase("VBA") < 0)
      System.out.println(name + " comes before VBA");
    if (name.compareToIgnoreCase("VBA") == 0 )
      System.out.println("VBA isn't a made up language");
    if (name.compareToIgnoreCase("VBA") > 0)
      System.out.println(name + " comes after VBA");

  }
}
