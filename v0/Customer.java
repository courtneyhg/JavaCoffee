import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Customer {
  double budget = Math.round((Math.random() * 50.00) * 100) / 100.0;

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
          System.out.println("Great! Anything else?");
        }
    }
    catch (Exception e) {
      System.out.println("Uhm...What?");
    }

  }
} //end class

/*--------------------courtney--------------------------------*/
  public void play() {

    System.out.println("Here is your budget, use it wisely: $" + budget);

    int item = 6;
    int prices = 2;
    String[][] newArray = new String[item][prices];
    newArray[0][0] = "6 oz of cat poop coffee - ";
    newArray[0][1] = "$35.25";

    newArray[1][0] = "8 oz of cat poop coffee - ";
    newArray[1][1] = "$45.50";

    newArray[2][0] = "regular coffee - ";
    newArray[2][1] = "$3.00";

    newArray[3][0] = "macchiato - ";
    newArray[3][1] = "$3.50";

    newArray[4][0] = "flat white - ";
    newArray[4][1] = "$4.25";

    newArray[5][0] = "cuppuccino - ";
    newArray[5][1] = "$5.50";

    for(int i = 0; i < newArray.length; i++){
      System.out.print("\n");
      for(int j = 0; j <newArray[i].length; j++){
        System.out.print(newArray[i][j]);
      }
    }
  }
}
/*--------------------courtney--------------------------------*/
