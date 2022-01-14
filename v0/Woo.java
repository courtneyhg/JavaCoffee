import java.util.Scanner;
import java.util.ArrayList;

public class Woo {

  public static void main(String[] args) {
    Scanner g = new Scanner(System.in);
    System.out.println("\nWelcome to Café Cat Caca! 🐈 What are you here for?\n\t1. I am a customer.\n\t2. I am the new employee.");
    if ( g.nextLine().equals("1") ) {
      System.out.println("Lovely! What can I get for you today?");
    }
    else {
      System.out.println("Nice to have ya here. Let's get started.");
    }
  }
}
