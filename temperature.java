import java.util.Scanner;

public class temperature {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean validInput1 = false;
    boolean validInput2 = false;
    System.out.print("\nEnter a origin scale: ");
    String oScale = in.nextLine();
    oScale = oScale.toLowerCase();
    while (!validInput1) {
      switch (oScale) {
        case "c":
        case "f":
        case "k":
        validInput = true;
        break;
        default:
          validInput = false;
          System.out.print("Enter a origin scale: ");
          oScale = in.nextLine();
      }
    }
    System.out.print("\nEnter a destination scale: ");
    String dScale = in.nextLine();
    while (!validInput2) {
      switch (dScale) {
        case "c":
        case "f":
        case "k":
        validInput = true;
        break;
        default:
          validInput = false;
          System.out.print("Enter a destination scale: ");
          dScale = in.nextLine();
      }
    }


    in.close();
  }
}
