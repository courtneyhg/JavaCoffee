import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Customer {
  Scanner c = new Scanner(System.in);
  double budget = Math.round((Math.random() * 50.00) * 100) / 100.0;
  int drinkCount = 0;
  // String[][] receipt = new String[10][2];
  ArrayList <ArrayList<String>> receipt = new ArrayList<ArrayList<String>>();
  // receipt.add();

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

  public void order() {
    System.out.print("\nWhat would you like to order? ");
    String drink = c.nextLine();
    String k = "123456789";
    int p = Integer.parseInt(drink);
    receipt.add(new ArrayList<String>());
    receipt.get(0).add(0, "Item");
    receipt.get(0).add(1, "Price");

    if (k.contains(drink)) {
      receipt.get(drinkCount+1).add(menu[p][0].substring(3));
      receipt.get(drinkCount+1).add(menu[p][1]);
      receipt.add(new ArrayList<String>());
      // receipt[(drinkCount+1)][0] = menu[p][0].substring(3);
      // receipt[(drinkCount+1)][1] = menu[p][1];
      System.out.println("You have excellent taste! The " + menu[p][0].toLowerCase().substring(3) + " is delicious. Would you like anything else?");
      System.out.println("\t1. Yes\n\t2. No");
      String orderMore = c.nextLine();
      if (orderMore.equals("1")) {
        drinkCount++;
        order();
      }
      else if (orderMore.equals("2")) {
        receipt();
      }
    }
  }//end order

  public void receipt() {
    // receipt.add(new ArrayList<String>());
    // receipt.get(0).add(0, "Item");
    // receipt.get(0).add(1, "Price");
    System.out.println("\nSweet! Here is your receipt.\n" + receipt);
    // receipt[0][0] = "Item";
    // receipt[0][1] = "Price";
    // for (int r = 0; r < receipt.length; r++) {
    //   for (int s = 0; s < (receipt[r].length); s++) {
    //     if (receipt[r][s]==null) {
    //       break;
    //     }
    //     if (s == 0) {
    //       System.out.print("\t" + receipt[r][s] + " | ");
    //     }
    //     else {
    //       System.out.print(receipt[r][s]);
    //     }
    //   }
    //   System.out.println();
    // }


  }//end receipt

  public void cplay() {
    System.out.println("Your budget is $" + budget + ".\nTake a look at our menu below!\n");

    for (int i = 0; i < (menu.length); i++) {
      for (int j = 0; j < (menu[i].length); j++) {
        if (j == 0) {
          System.out.print("\t" + menu[i][j] + " | ");
        }
        else {
          System.out.print(menu[i][j]);
        }
      }
      System.out.println();
    }

    try {
      order();
        // if (k.contains(drink)) {
        //   System.out.println("You have excellent taste! The " + menu[p][0].toLowerCase().substring(3) + " is delicious. Anything else? ");
        //
        //   String orderMore = c.nextLine();
        //   if (orderMore.toLowerCase().equals("yes")) {
        //
        //   }
        // } //end contain drink
    }//end try

    catch (Exception e) {
      System.out.println("Something went wrong. Exiting game.");
    }//end catch

  }//end cplay
} //end class
