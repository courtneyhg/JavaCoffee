import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
  Scanner e = new Scanner(System.in);
  ArrayList <ArrayList<String>> menu = new ArrayList<ArrayList<String>>();

  public void eplay() {
    System.out.println("\nNice to have ya here. Let's get started.");
    System.out.print("First, what should I call you? ");
    String eName = e.nextLine();
    System.out.println("Hello, " + eName + "! Here are the basics:");
    System.out.println("\t- Your hourly wage is $15 per hour.\n\t- You work 8 hour shifts on 3 days of the week.\n\t- You get paid biweekly.\n\t- Your job is to memorize our menu and restock when necessary.\n\t\tMenu:");

    for (int a = 0; a < 11; a++) {
      menu.add(new ArrayList<String>());;
    }

    menu.get(0).add(0, "Item");
    menu.get(0).add(1, "Price");
    menu.get(0).add(2, "Stock");
    menu.get(1).add(0, "1. Cold Brew");
    menu.get(1).add(1, "6.00");
    menu.get(1).add(2, "Stock");
    menu.get(2).add(0, "2. Latte");
    menu.get(2).add(1, "$6.75");
    menu.get(2).add(2, "Stock");
    menu.get(3).add(0, "3. Cappucino");
    menu.get(3).add(1, "$6.50");
    menu.get(3).add(2, "Stock");
    menu.get(4).add(0, "4. Cortado");
    menu.get(4).add(1, "$4.75");
    menu.get(4).add(2, "Stock");
    menu.get(5).add(0, "5. Espresso Shot");
    menu.get(5).add(1, "$4.00");
    menu.get(5).add(2, "Stock");
    menu.get(6).add(0, "6. Americano");
    menu.get(6).add(1, "$5.00");
    menu.get(6).add(2, "Stock");
    menu.get(7).add(0, "7. Affgato");
    menu.get(7).add(1, "$7.00");
    menu.get(7).add(2, "Stock");
    menu.get(8).add(0, "8. Espresso con Panna");
    menu.get(8).add(1, "$6.55");
    menu.get(8).add(2, "Stock");
    menu.get(9).add(0, "9. Mocha");
    menu.get(9).add(1, "$7.25");
    menu.get(9).add(2, "Stock");
    menu.get(10).add(0, "10.Cat Caca Whole Coffee Beans");
    menu.get(10).add(1, "$45.75");
    menu.get(10).add(2, "Stock");

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

    //
    // int one = (int) (Math.random() * 50);
    // int two = (int) (Math.random() * 50);
    // int three = (int) (Math.random() * 50);
    // int four = (int) (Math.random() * 50);
    // int five = (int) (Math.random() * 50);
    // int six = (int) (Math.random() * 50);
    // int seven = (int) (Math.random() * 50);
    // int eight = (int) (Math.random() * 50);
    // int nine = (int) (Math.random() * 50);
    // System.out.println("Item - Stock");
    // System.out.println("1. Cold Brew - " + one);
    // System.out.println("2. Latte - " + two);
    // System.out.println("3. Cappucino - " + three);
    // System.out.println("4. Cortado - " + four);
    // System.out.println("5. Espresso Shot - " + five);
    // System.out.println("6. Americano - " + six);
    // System.out.println("7. Affogato - " + seven);
    // System.out.println("8. Espresso con Panna - " + eight);
    // System.out.println("9. Mocha - " + nine);
    //
    // System.out.println("enter the stuff in order");
    //
    // String eSort = e.nextLine();

  //     public static void bubbleSortV( ArrayList<Integer> data )
  // {
  //   for (int p=0; p < data.size(); p++){ //makes sure it goes through all passes
  //     for (int i = data.size()-1; i>0; i--){ //for loop for each pass
  //       //gets element at index
  //       int bob = data.get(i);
  //       int jeff = data.get(i-1);
  //       //swap ints
  //       if (bob < jeff){
  //         data.set(i, jeff);
  //         data.set(i-1, bob);
  //       }
  //     }
  //   }
  // }

//   public static ArrayList<Integer> bubbleSort( ArrayList<Integer> input )
// {
//   bubbleSortV(input);
//   return input;
// }
//
// ArrayList stockOrder = new ArrayList<Integer>();
//       stockOrder.add(one);
//       stockOrder.add(two);
//       stockOrder.add(three);
//       stockOrder.add(four);
//       stockOrder.add(five);
//       stockOrder.add(six);
//       stockOrder.add(seven);
//       stockOrder.add(eight);
//       stockOrder.add(nine);
//
//   // bubbleSortV(stockOrder);
//   bubbleSort(stockOrder)
//   System.out.println(bubbleSort(stockOrder));
//     //System.out.println("Hello, " + eSort + "! Here are the basics:");
//   }
}//end class
