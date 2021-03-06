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

    menu.get(0).add(0, "Item");   // menu.add(new ArrayList<String>(Arrays.asList("Items", "Price", "Stock")));
    menu.get(0).add(1, "Price");
    menu.get(0).add(2, "Stock");
    menu.get(1).add(0, "01. Cold Brew");
    menu.get(1).add(1, "6.00");
    menu.get(1).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(2).add(0, "02. Latte");
    menu.get(2).add(1, "$6.75");
    menu.get(2).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(3).add(0, "03. Cappucino");
    menu.get(3).add(1, "$6.50");
    menu.get(3).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(4).add(0, "04. Cortado");
    menu.get(4).add(1, "$4.75");
    menu.get(4).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(5).add(0, "05. Espresso Shot");
    menu.get(5).add(1, "$4.00");
    menu.get(5).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(6).add(0, "06. Americano");
    menu.get(6).add(1, "$5.00");
    menu.get(6).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(7).add(0, "07. Affogato");
    menu.get(7).add(1, "$7.00");
    menu.get(7).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(8).add(0, "08. Espresso con Panna");
    menu.get(8).add(1, "$6.55");
    menu.get(8).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(9).add(0, "09. Mocha");
    menu.get(9).add(1, "$7.25");
    menu.get(9).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
    menu.get(10).add(0, "10. Cat Caca Whole Coffee Beans");
    menu.get(10).add(1, "$45.75");
    menu.get(10).add(2, Integer.toString(1 + (int) (Math.random() * 50)));
  } //end createMenu

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
  } //end printMenu

  public void justStock() {
    menu.remove(0);
    for (int v = 0; v < menu.size(); v++) {
      stockOrder.add(v, Integer.parseInt(menu.get(v).get(2)));
    }
  } //end justStock

  public void ogStock(ArrayList<Integer> a) {
    System.out.println("\t\tJust the Stock:");
   for (int w = 0; w < a.size(); w++) {
     System.out.println("\t" + a.get(w) + " ");
  }
} //end ogStock

   public void printStock(){
     System.out.println("\t\tJust the Stock:");
     for (int w = 0; w < stockOrder.size(); w++) {
       System.out.println("\t" + stockOrder.get(w) + " ");
     }
   } //end printStock

   public void takeOrder() throws InterruptedException{
     double rr = (Math.random() * 10) + 1.0;
     int orderNumber = (int) rr;
     System.out.println("\nYour customer wants to order a number 0" + orderNumber);
     createMenu();
     String answer = (menu.get(orderNumber).get(0)).substring(4);
     // System.out.println(answer);
     System.out.println("\nWhat drink is number 0" + orderNumber + "?");
     String userAnswer = e.nextLine();
     if (!(userAnswer.equals(answer))){ //if wrong first time
       System.out.println("\n. . . Making a " + userAnswer + " . . .");
       System.out.println("\nYou messed up the customer's order. They throw the coffee at you, assault you with not so PG-13 words, and leave an angry review. Mess up one more time, and you're fired.");
       takeOrder2(); //last chance to do order correctly
       //catchtheRobr();
     }  else { //if right
       System.out.println("\n. . .Making the coffee . . .");
        int l = 0;
        while (l < 25) {
          System.out.print(" - ");
          Thread.sleep(100);
          l++;
        }
       System.out.println("\n. . .You place the coffee on the counter . . .");

       //error for thread.sleep() but not important piece of code
        int po = 0;
        while (po < 25) {
          System.out.print(" - ");
          Thread.sleep(100);
          po++;
        }


       catchtheRobr();

     }





   } //end takeOrder


   public void takeOrder2() throws InterruptedException
   { //only happens if first order is wrong
     double rr = (Math.random() * 10) + 1.0;
     int orderNumber = (int) rr;
     System.out.println("\nAnother customer wants to order a number 0" + orderNumber);
     createMenu();
     String answer = (menu.get(orderNumber).get(0)).substring(4);
     System.out.println("\nWhat drink is number 0" + orderNumber + "?");
     String userAnswer = e.nextLine();
     if (!(userAnswer.equals(answer))){
       System.out.println("\nWrong again. You disappoint me. You're fired. Get out of here . . .");
       System.exit(0);
     } else {
       System.out.println("\nEveryone makes a mistake in this business. Good thing you've gotten better . . .");
       System.out.println("\n. . . Making a " + userAnswer + " . . .");
       catchtheRobr();
   }
 } //end takeOrder2

  public void catchtheRobr() throws InterruptedException{
    boolean a = true;
    System.out.println("\nUh-oh! The customer decided to steal the coffee without paying!!! What do you do?!?! \n\t1. Not my problem. Let dem go.\n\t2. Try to catch dem.");
    while (a){
    String choice = e.nextLine();
    if (choice.equals("2")){
        catchtheRobrgame();
        a = false;
    }
    if (choice.equals("1")){
      System.out.println("\n You literally just stood there while they were getting away . . . You're fired . . .");
      System.exit(0);
    }
    System.out.println("\n Choice a valid option, noob.");
  }
} //end catchtheRobr

  public void catchtheRobrgame() throws InterruptedException{
    System.out.println("\nYou look at the register and see a paper saying 'Door Lock Code' with a string a numbers following it. \n\n Type in the following numbers you see to lock the door! Hurry, you have 5 seconds!!!");
    int uwu = (int) (Math.random() * 10);
    int owo = (int) (Math.random() * 10);
    int owu = (int) (Math.random() * 10);
    int uwo = (int) (Math.random() * 10);
    Thread.sleep(8000);
    String noombas = String.valueOf(uwu) + " " + String.valueOf(owo) + " " + String.valueOf(owu) + " " + String.valueOf(uwo);
    System.out.println(noombas);
    Long startTime = System.currentTimeMillis();
    String userAnswer = e.nextLine();
    Long endTime = System.currentTimeMillis();

    if (userAnswer.equals(noombas)){
      if (((endTime - startTime)/1000.0) > 5){
        System.out.println("\n . . . You were too slow and they got away . . . You just got fired . . .");
        System.exit(0);
      } else {
        System.out.println("\nYou entered the pin correctly and fast enough that the door locked before the thief was able to escape. You call the police and they come and arrest thy noob. For doing such an excellent job, I am giving my position of Manager to you. (It's about time I retired)");
        System.exit(0);
      }
    } else {
       System.out.println("\n . . . You entered the wrong pin and the thief got away . . . I cannot have someone as blind as you be working here . . . You're fired, dummy.");
       System.exit(0);
    }
  } //end catchtheRobrgame


   //bubble sorts
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








  public void eplay() throws InterruptedException{ //main method to use
    System.out.println("\nNice to have ya here. Let's get started.");
    System.out.print("First, what should I call you? ");
    String eName = e.nextLine();
    System.out.println("Hello, " + eName + "! Here are the basics:");


    // commented this out for now
    System.out.println("\t- Your hourly wage is $15 per hour.\n\t- You work 8 hour shifts on 3 days of the week.\n\t- You get paid biweekly.\n\t- Your job is to memorize our menu and restock when necessary.\n\t- Promote items low in stock.\n\t\tMenu:");
    createMenu();
    printMenu();
    justStock();
    printStock();
    Thread.sleep(8000);
     int l = 0;
        while (l < 25) {
          System.out.print(" - ");
          Thread.sleep(100);
          l++;
        }

    System.out.println("\nBy typing in the numbers next to the items, put them in increasing order by stock.");
    System.out.println("\nEnter the number in stock in ascending order. Make sure to separate each number with a space. You have 40 seconds.");
    long startTime = System.currentTimeMillis();
    String eSort = e.nextLine();
    long endTime = System.currentTimeMillis();
    System.out.println("That took " + ((endTime - startTime)/1000.0) + " seconds.");

    ArrayList stockOrderCopy = new ArrayList<Integer>(stockOrder);




    if (eSort.equals(StringifybubbleSort(stockOrder)) == true && ((endTime - startTime)/1000.0) <= 40 ){
      System.out.print("\nPog. You completed your first job.");
      System.out.println("\nThis is the new stock order.");
      System.out.println(StringifybubbleSort(stockOrder));
      System.out.println("\nLet's take customer's order");
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

  } //end eplay
} //end class
