import java.util.Scanner;
import java.util.ArrayList;

public class Woo {

  public static void main(String[] args) throws InterruptedException {
    Scanner g = new Scanner(System.in);
    // Woo back = new Woo();
    Customer bob = new Customer();
    Employee joe = new Employee();
    System.out.println("\nLaunching Game...");
    //commenting out animationjust to save time for now whenever we run to fix errors
    int l = 0;
    while (l < 25) {
      System.out.print(" - ");
      Thread.sleep(100);
      l++;
    }

    System.out.println("\nYou will be roleplaying in this game at a café.");
    System.out.println("Type the numbers next to the options to play.");

    while (l < 50) {
      System.out.print(" - ");
      Thread.sleep(100);
      l++;
    }

    System.out.println("\n\nWelcome to Café Cat Caca! What are you here for?\n\t1. A customer.\n\t2. The new employee.");
    System.out.print("I am: ");

    while (true){ //so game doesn't exit if user chooses something other than 1/2
      String role = g.nextLine();
      if (role.equals("1")){
        System.out.println("\nYou chose to be the new Customer.");
        bob.cplay();
        System.exit(0);
      }
      if (role.equals("2")){
        System.out.println("\nYou chose to be the new Employee.");
        joe.eplay();
        System.exit(0);
      }
      System.out.print("Choose a valid option:");
    }



    // try {
    //   String role = g.nextLine();
    //   if ( role.equals("1") ) {
    //     bob.cplay();
    //   }
    //   else if ( role.equals("2") ){
    //     joe.eplay();
    //   }
    // }
    // catch (Exception e) {
    //   System.out.println("Something went wrong. Exiting game.");
    // }
  }//end main
}//end class
