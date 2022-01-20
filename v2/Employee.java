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

    //making menu
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



    System.out.println("Enter the number in stock in ascending order. Make sure to separate each number with a space. You have 40 seconds.");
    long startTime = System.currentTimeMillis();
    String eSort = e.nextLine();
    long endTime = System.currentTimeMillis();
    System.out.println("That took " + ((endTime - startTime)/1000.0) + " seconds");
    // //Second try. If fail, then game ends.
    if (((endTime - startTime)/1000.0) > 40 || eSort.equals(StringifybubbleSort(stockOrder)) == false){
        System.out.println("\n You've somehow been so bad at your job that you are now working at below minimum wage. Mess up one more time, and you're fired.");
        int one1 = (int) (Math.random() * 50);
        int two2 = (int) (Math.random() * 50);
        int three3 = (int) (Math.random() * 50);
        int four4 = (int) (Math.random() * 50);
        int five5 = (int) (Math.random() * 50);
        int six6 = (int) (Math.random() * 50);
        int seven7 = (int) (Math.random() * 50);
        int eight8 = (int) (Math.random() * 50);
        int nine9 = (int) (Math.random() * 50);
        System.out.println("Item - Stock");
        System.out.println("1. Cold Brew - " + one1);
        System.out.println("2. Latte - " + two2);
        System.out.println("3. Cappucino - " + three3);
        System.out.println("4. Cortado - " + four4);
        System.out.println("5. Espresso Shot - " + five5);
        System.out.println("6. Americano - " + six6);
        System.out.println("7. Affogato - " + seven7);
        System.out.println("8. Espresso con Panna - " + eight8);
        System.out.println("9. Mocha - " + nine9);
        System.out.println("Enter the number in stock in ascending order. You have 40 seconds.");
        long startTime1 = System.currentTimeMillis();
        String eSor1t = e.nextLine();
        long endTime1 = System.currentTimeMillis();
        System.out.println("That took " + ((endTime1 - startTime1)/1000.0) + " seconds");
        if (((endTime1 - startTime1)/1000.0) > 40 || eSort.equals(StringifybubbleSort(stockOrder)) == false){
            System.out.println("You just got fired dummy.");
            System.exit(0);
        }

        System.out.print("Nice job!");
    }
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
    for (int i = 0; i < input.size(); i++){
      stuff = stuff + input.get(i) + " ";
    }
  return stuff;
  }
}
