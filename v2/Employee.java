import java.util.Scanner;
import java.util.ArrayList;



public class Employee {
  Scanner e = new Scanner(System.in);

  public void eplay() {
    System.out.println("\nNice to have ya here. Let's get started.");
    System.out.print("First, what should I call you? ");
    String eName = e.nextLine();
    System.out.println("Hello, " + eName + "! Here are the basics:");
    System.out.println("\t- Your hourly wage is $15 per hour.\n\t- You work 8 hour shifts on 3 days of the week.\n\t- You get paid biweekly.\n\t- Your first job is to restock our menu.\n");

    // String[][] menu = {
    //   {"Item", "Price"},
    //   {"1. Cold Brew", "$6.00"},
    //   {"2. Latte", "$6.75"},
    //   {"3. Cappucino", "$6.50"},
    //   {"4. Cortado", "$4.75"},
    //   {"5. Espresso Shot", "$4.00"},
    //   {"6. Americano", "$5.00"},
    //   {"7. Affogato", "$7.00"},
    //   {"8. Espresso con Panna", "$6.50"},
    //   {"9. Mocha", "$7.25"}
    // };
    //
    // for (int i = 0; i < (menu.length); i++) {
    //   for (int j = 0; j < (menu[i].length); j++) {
    //     if (j == 0) {
    //       System.out.print("\t" + menu[i][j] + " | ");
    //     }
    //     else {
    //       System.out.print(menu[i][j]);
    //     }
    //   }
    //   System.out.println("");
    // }


    int one = (int) (Math.random() * 50);
    int two = (int) (Math.random() * 50);
    int three = (int) (Math.random() * 50);
    int four = (int) (Math.random() * 50);
    int five = (int) (Math.random() * 50);
    int six = (int) (Math.random() * 50);
    int seven = (int) (Math.random() * 50);
    int eight = (int) (Math.random() * 50);
    int nine = (int) (Math.random() * 50);
    System.out.println("Item - Stock");
    System.out.println("1. Cold Brew - " + one);
    System.out.println("2. Latte - " + two);
    System.out.println("3. Cappucino - " + three);
    System.out.println("4. Cortado - " + four);
    System.out.println("5. Espresso Shot - " + five);
    System.out.println("6. Americano - " + six);
    System.out.println("7. Affogato - " + seven);
    System.out.println("8. Espresso con Panna - " + eight);
    System.out.println("9. Mocha - " + nine);

    System.out.println("enter the stuff in order");

    String eSort = e.nextLine();

ArrayList stockOrder = new ArrayList<Integer>();
      stockOrder.add(one);
      stockOrder.add(two);
      stockOrder.add(three);
      stockOrder.add(four);
      stockOrder.add(five);
      stockOrder.add(six);
      stockOrder.add(seven);
      stockOrder.add(eight);
      stockOrder.add(nine);

  //bubbleSort(stockOrder)
  System.out.println(bubbleSort(stockOrder));
    //System.out.println("Hello, " + eSort + "! Here are the basics:");
  }

  public static void bubbleSortV( ArrayList<Integer> data )
  {
  for (int p=0; p < data.size(); p++){ //makes sure it goes through all passes
  for (int i = data.size()-1; i>0; i--){ //for loop for each pass
    //gets element at index
    int bob = data.get(i);
    int jeff = data.get(i-1);
    //swap ints
    if (bob < jeff){
      data.set(i, jeff);
      data.set(i-1, bob);
    }
  }
  }
  }

  public static ArrayList<Integer> bubbleSort( ArrayList<Integer> input )
  {
  bubbleSortV(input);
  return input;
  }
}//end class
