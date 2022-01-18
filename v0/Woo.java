import java.util.Scanner;
import java.util.ArrayList;

public class Woo {

  public static void main(String[] args) {
    Scanner g = new Scanner(System.in);
    Customer bob = new Customer();
    Employee joe = new Employee();
    System.out.println("\nWelcome to Café Cat Caca! 🐈 What are you here for?\n\t1. I am a customer.\n\t2. I am the new employee.");
    if ( g.nextLine().equals("1") ) {
      System.out.println("Lovely! What can I get for you today?");
      bob.play();
    }
    else {
      System.out.println("Nice to have ya here. Let's get started.");
      joe.eplay();
    }
  }
}
