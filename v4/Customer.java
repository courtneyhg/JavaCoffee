import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Customer {
  Scanner c = new Scanner(System.in);
  double budget = Math.round((Math.random() * 50.00) * 100) / 100.0;

  int drinkCount = 0;
  ArrayList <ArrayList<String>> receipt = new ArrayList<ArrayList<String>>();
  double total;

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
    {"9. Mocha", "$7.25"},
    {"10.Cat Caca Whole Coffee Beans", "$45.75"}
  };

  public void order() {
    System.out.print("\nWhat would you like to order? ");
    String drink = c.nextLine();
    String k = "12345678910";
    int p = Integer.parseInt(drink);


    if (k.contains(drink)) {
      drinkCount++;
      receipt.add(new ArrayList<String>());
      receipt.get(drinkCount).add(menu[p][0].substring(3));
      receipt.get(drinkCount).add(menu[p][1]);
      System.out.println("You have excellent taste! The " + menu[p][0].toLowerCase().substring(3) + " is delicious. Would you like anything else?");
      System.out.println("\t1. Yes\n\t2. No");
      String orderMore = c.nextLine();
      if (orderMore.equals("1")) {
        order();
      }
      else if (orderMore.equals("2")) {
        receipt();
      }
    }
  }//end order

  public void receipt() {
    System.out.println("\nSweet! Here is your receipt.");
    receipt.add(new ArrayList<String>());
    // receipt.get(receipt.size() - 1).add("Total");
    // receipt.get(receipt.size() - 1).add("$" + Double.toString(total));
    for (int r = 0; r < receipt.size(); r++) {
      for (int s = 0; s < (receipt.get(r).size()); s++) {
        if (s == 0) {
          System.out.print("\t" + receipt.get(r).get(s) + " | ");
        }
        else {
          String pri = (receipt.get(r).get(s));
          System.out.print(pri);
          if (r > 0) {
            pri = pri.substring(1);
            double dolla = Double.parseDouble(pri);
            total += dolla;
          }
          if (r == receipt.size() - 1) {
            System.out.print(receipt.get(receipt.size() - 1).get(1));
          }
        }
      }
      System.out.println();
    }
    System.out.println("\tYour total is $" + total + ".");
    // receipt.get(receipt.size() - 1).add(0, "Total");
    // System.out.println(receipt);
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

    receipt.add(new ArrayList<String>());
    receipt.get(0).add(0, "Item");
    receipt.get(0).add(1, "Price");


    try {
      order();
    }//end try

    catch (Exception e) {
      //System.out.println("Something went wrong. Exiting game.");
    }//end catch

    if (budget<total){
      System.out.println("\nYou don't have enough money. Go dine and dash!");

      String s;
      int choice;
      int lives = 3;


      while(lives != 0){
        s = "\nWhich way are you running?\n";
        s += "\t1: left\n";
        s += "\t2: right\n";

        System.out.print(s);

        try {
          choice = Integer.parseInt(c.nextLine());
          if (choice == 1){
            lives = 2;
            System.out.println("oof. wrong way, the employee is catching up!");
            System.out.println("you lost a life, you have " + lives + " lives left");
          }
          if (choice == 2){
            System.out.println("good turn, you're almost out of the cafe!");
          }
        }
        catch (Exception e) {}

          s = "\nWhich way are you hopping?\n";
          s += "\t1: over the chair\n";
          s += "\t2: off the wall\n";

          System.out.print(s);

          try {
            choice = Integer.parseInt(c.nextLine());
            if (choice == 1){
              System.out.println("Wow, I guess you're good at stealing!");
            }
            if (choice == 2){
              lives -= 1;
              System.out.println("Oops, you fell down and the employees are on your tail.");
              System.out.println("You lost a life, you have " + lives + " lives left.");
            }
          }
          catch (Exception e) {}


            s = "\nHow will you distract the chasing employee?\n";
            s += "\t1: throwing flowers with thorns\n";
            s += "\t2: play dead\n";

            System.out.print(s);

            try {
              choice = Integer.parseInt(c.nextLine());
              if (choice == 1){
                System.out.println("Good move! You have momentarily stopped the employee!");
              }
              if (choice == 2){
                lives -= 1;
                if (lives == 0){
                  System.out.println("Seriously? No one's going to believe you're dead");
                  System.out.println("You lost a life, you have " + lives + " lives left.");
                  System.out.println("You're spending the night in jail. Have fun...\nGAME OVER.");
                  break;
                }
                else {
                  System.out.println("Seriously? No one's going to believe you're dead");
                  System.out.println("You lost a life, you have " + lives + " lives left.");
                }
              }
            }
            catch (Exception e) {}

              s = "\nQuick, hide from the employee!\n";
              s += "\t1: Hide in a baby's stroller\n";
              s += "\t2: Pretend to be an employee\n";

              System.out.print(s);

              try {
                choice = Integer.parseInt(c.nextLine());
                if (choice == 1){
                  System.out.println("No one can find WALDO!");
                }
                if (choice == 2){
                  lives -= 1;
                  if (lives == 0){
                    System.out.println("You failed to get an employee uniform and was quickly found...");
                    System.out.println("You lost a life, you have " + lives + " lives left.");
                    System.out.println("You're spending the night in jail. Have fun...\nGAME OVER.");
                    break;
                  }
                  else {
                    System.out.println("You failed to get an employee uniform and was quickly found...");
                    System.out.println("You lost a life, you have " + lives + " lives left.");
                  }
                }
              }
              catch (Exception e) {}

            s = "\nYou're almost out of the store, this is the crucial decision....";
            s = "How are you exiting?\n";
            s += "\t1: Out the window\n";
            s += "\t2: Stealing a kid's scooter and dipping\n";

            System.out.print(s);

            try {
              choice = Integer.parseInt(c.nextLine());
              if (choice == 1){
                lives -= 1;
                System.out.println("WRONG MOVE! THEY CAUGHT YOU!");
                System.out.println("You have " + lives + " left");
                System.out.println("You're spending the night in jail. Have fun...\nGAME OVER.");
              }
              if (choice == 2){
                System.out.println("You successfully dined and dashed! You even scored an extra scooter!");
              }
            }
            catch (Exception e) {}

            }



    }
    else{
      budget -= total;
      System.out.println("\nYou paid and now have $" + budget + " remaining. Congrats! You're our 100th customer and you are eligible for a prize if you win our game.");
    }




  }//end cplay
} //end class
