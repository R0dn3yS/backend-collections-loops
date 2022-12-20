import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    boolean play = true;
    String ongeldig = "Ongeldige invoer";

    Scanner sc = new Scanner(System.in);
    Translator translator = new Translator(numeric, alphabetic);

    while (play) {
      System.out.println("Type 'x' om te stoppen\nType 'v' om te vertalen");
      String input = sc.nextLine();

      if (input.equals("x")) {
        play = false;
      } else if (input.equals("v")) {
        System.out.println("Type een cijfer in van 0 t/m 9");
        int number = sc.nextInt();
        sc.nextLine();

        if (number < 10) {
          String result = Translator.translate(number);
          System.out.println("De vertaling van " + number + " is " + result);
        } else {
          System.out.println(ongeldig);
        }
      } else {
        System.out.println(ongeldig);
      }
    }
  }
}