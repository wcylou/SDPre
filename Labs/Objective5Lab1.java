public class Objective5Lab1 {
  public static void main(String[]args) {
    int month = 6;

    System.out.print(month+ ": ");

    switch (month) {
      case 1:
      System.out.println("January");
      break;

      case 6:
      System.out.println("June");
      break;

      default:
        System.out.println("Thats is not a valid month");
        break;
    }
  }
}
