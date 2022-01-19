import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
  Scanner e = new Scanner(System.in);

  public void eplay() {
    System.out.println("\nNice to have ya here. Let's get started.");
    System.out.print("First, what should I call you? ");
    String eName = e.nextLine();
    System.out.println("Hello, " + eName + "! Here are the basics:");
    System.out.println("\t- Your hourly wage is $15 per hour.\n\t- You work 8 hour shifts on 3 days of the week.\n\t- You get paid biweekly.\n\t- Please memorize our menu below.\n");

    String[][] menu = {
      {"Item", "Price"},
      {"1. Cold Brew", "$6.00"},
      {"2. Latte", "$6.75"},
      {"3. Cappucino", "$6.50"},
      {"4. Cortado", "$4.75"},
      {"5. Espresso Shot", "$4.00"},
      {"6. Americano", "$5.00"},
      {"7. Affogato", "$7.00"},
      {"8. Espresso con Panna", "$6.50"},
      {"9. Mocha", "$7.25"}
    };

    for (int i = 0; i < (menu.length); i++) {
      for (int j = 0; j < (menu[i].length); j++) {
        if (j == 0) {
          System.out.print("\t" + menu[i][j] + " | ");
        }
        else {
          System.out.print(menu[i][j]);
        }
      }
      System.out.println("");
    }

  }
}//end class
