import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Employee {
  Scanner e = new Scanner(System.in);
  ArrayList <ArrayList<String>> menu = new ArrayList<ArrayList<String>>();
  ArrayList stockOrder = new ArrayList<Integer>();

  public void createMenu() {

    for (int a = 0; a < 11; a++) {
      menu.add(new ArrayList<String>());;
    }

    // menu.add(new ArrayList<String>(Arrays.asList("Items", "Price", "Stock")));
    menu.get(0).add(0, "Item");
    menu.get(0).add(1, "Price");
    menu.get(0).add(2, "Stock");
    menu.get(1).add(0, "1. Cold Brew");
    menu.get(1).add(1, "6.00");
    menu.get(1).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(2).add(0, "2. Latte");
    menu.get(2).add(1, "$6.75");
    menu.get(2).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(3).add(0, "3. Cappucino");
    menu.get(3).add(1, "$6.50");
    menu.get(3).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(4).add(0, "4. Cortado");
    menu.get(4).add(1, "$4.75");
    menu.get(4).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(5).add(0, "5. Espresso Shot");
    menu.get(5).add(1, "$4.00");
    menu.get(5).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(6).add(0, "6. Americano");
    menu.get(6).add(1, "$5.00");
    menu.get(6).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(7).add(0, "7. Affogato");
    menu.get(7).add(1, "$7.00");
    menu.get(7).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(8).add(0, "8. Espresso con Panna");
    menu.get(8).add(1, "$6.55");
    menu.get(8).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(9).add(0, "9. Mocha");
    menu.get(9).add(1, "$7.25");
    menu.get(9).add(2, Integer.toString((int) (Math.random() * 50)));
    menu.get(10).add(0, "10.Cat Caca Whole Coffee Beans");
    menu.get(10).add(1, "$45.75");
    menu.get(10).add(2, Integer.toString((int) (Math.random() * 50)));
  }

  public void printMenu() {
    for (int r = 0; r < menu.size(); r++) {
      for (int s = 0; s < (menu.get(r).size()); s++) {
        if (s == 0) {
          System.out.print("\t" + menu.get(r).get(s) + " | ");
        }
        else if (s == 1) {
          System.out.print(menu.get(r).get(s) + " | ");
        }
        else {
          System.out.print(menu.get(r).get(s));
        }
      }
      System.out.println();
    }
  }

  public void justStock() {
    menu.remove(0);
    for (int v = 0; v < menu.size(); v++) {
      stockOrder.add(v, Integer.parseInt(menu.get(v).get(2)));
    }
  }

  public void ogStock(ArrayList<Integer> a) {
    System.out.println("\t\tJust the Stock:");
   for (int w = 0; w < a.size(); w++) {
     System.out.println("\t" + a.get(w) + " ");
  }
}

   public void printStock(){
     System.out.println("\t\tJust the Stock:");
     for (int w = 0; w < stockOrder.size(); w++) {
       System.out.println("\t" + stockOrder.get(w) + " ");
     }
   }

   public void takeOrder(){
     double orderNumber = (int)(Math.random() * 10 +1);
     System.out.println(orderNumber);
     System.out.println("\n Your customer wants a ");
   }

  public void eplay() {
    System.out.println("\nNice to have ya here. Let's get started.");
    System.out.print("First, what should I call you? ");
    String eName = e.nextLine();
    System.out.println("Hello, " + eName + "! Here are the basics:");

    System.out.println("\t- Your hourly wage is $15 per hour.\n\t- You work 8 hour shifts on 3 days of the week.\n\t- You get paid biweekly.\n\t- Your job is to memorize our menu and restock when necessary.\n\t- Promote items low in stock.\n\t\tMenu:");
    createMenu();
    printMenu();
    justStock();
    printStock();

    System.out.println("By typing in the numbers next to the items, put them in decreasing order by stock.");
    System.out.println("Enter the number in stock in ascending order. Make sure to separate each number with a space. You have 40 seconds.");
    long startTime = System.currentTimeMillis();
    String eSort = e.nextLine();
    long endTime = System.currentTimeMillis();
    System.out.println("That took " + ((endTime - startTime)/1000.0) + " seconds.");

    ArrayList stockOrderCopy = new ArrayList<Integer>(stockOrder);




    if (eSort.equals(StringifybubbleSort(stockOrder)) == true && ((endTime - startTime)/1000.0) <= 40 ){
      System.out.print("Pog. You completed your first job.");
      System.out.println("\nThis is the new stock order.");
      System.out.println(StringifybubbleSort(stockOrder));
      System.out.println("Let's take customer's order");
      // continue(); //make later(take custoemr order, stop them from dine and dash)
    } else {
        ogStock(stockOrderCopy);

        System.out.println("\nYou either took more than 40 seconds or ordered the stock wrong. Your wage has been reduced to beloe minimum wage now, dummy. You have one more chance before you are fired");
        System.out.println("Enter the number in stock in ascending order. Make sure to separate each number with a space. You have 40 seconds.");
        long startTime2 = System.currentTimeMillis();
        String eSort2 = e.nextLine();
        long endTime2 = System.currentTimeMillis();
        System.out.println("\nThat took " + ((endTime2 - startTime2)/1000.0) + " seconds.");

        //sees if user's second try is corret

        if (eSort2.equals(StringifybubbleSort(stockOrder)) == true && ((endTime2 - startTime2)/1000.0) <= 40 ){
            System.out.println("You've succeeded at your first job . . . barely . . .");
          } else {
                System.out.println("\nYou just got fired, dummy.");
                System.out.println("\nHere is how you are supposed to do it!");
                printStock();
                System.exit(0);
    }
    }
    takeOrder();


  }


//bubblesorts
  public static void bubbleSortV( ArrayList<Integer> data ){
  for (int p=0; p < data.size(); p++){
    for (int i = data.size()-1; i>0; i--){
      int bob = data.get(i);
      int jeff = data.get(i-1);
        if (bob < jeff){
            data.set(i, jeff);
             data.set(i-1, bob);
    }
  }
  }
  }

  public static String StringifybubbleSort( ArrayList<Integer> input ) {
    String stuff = "";
    bubbleSortV(input);
    for (int i = 0; i < input.size() - 1; i++){
      stuff = stuff + input.get(i) + " ";
    }
  return stuff + input.get(input.size() - 1);
  }
}
