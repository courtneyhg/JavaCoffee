import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Customer {
  double budget = Math.round((Math.random() * 50.00) * 100) / 100.0;
  double bill;

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

  public void cplay() {
    Scanner c = new Scanner(System.in);
    System.out.println("Here is your budget: $" + budget + ". Take a look at our menu below!\n");

    // for (String[] item : menu) {
    //   for (String yas : item) {
    //     System.out.print("poop" + yas + " ");
    //   }
    //   System.out.println();
    // }

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
    System.out.print("\nWhat would you like to order? ");
    String order = c.nextLine();
    String k = "123456789";
    int p = Integer.parseInt(order);

    try {
        if (k.contains(order)) {
          // System.out.println(menu[p][2]);
          System.out.println("Great! Anything else?\n\t1. Yes.\n\t2. No.");
        }
    }  catch (Exception e) {
      System.out.println("Uhm...What?");
    }

    Scanner d = new Scanner(System.in);
    if ( d.nextLine().equals("1")){
      System.out.println("What else would you like to order? ");



  }
}
} //end class
