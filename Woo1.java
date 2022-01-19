import java.util.Scanner;
import java.util.ArrayList;

public class Woo {

  public static void main(String[] args) throws InterruptedException {
    Scanner g = new Scanner(System.in);
    // Woo back = new Woo();
    Customer bob = new Customer();
    Employee joe = new Employee();

    System.out.println("\nLaunching Game...");
      int l = 0;
    while (l < 25) {
      System.out.print(" - ");
      Thread.sleep(100);
      l++;
    }

    System.out.println("\nWelcome to Café Cat Caca! 🐈 What are you here for?\n\t1. I am a customer.\n\t2. I am the new employee.");

    if ( g.nextLine().equals("1") ) {
      System.out.println("\nLovely! What can I get for you today?");
      bob.cplay();
    }
    else if ( g.nextLine().equals("2") ){
      System.out.println("\nNice to have ya here. Let's get started.");
      joe.eplay();
    }

  }//end main
}//end class
