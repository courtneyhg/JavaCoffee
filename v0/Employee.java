import java.util.Scanner;
import java.util.ArrayList;

public class Employee {

  public static void eplay() {
    Scanner e = new Scanner(System.in);
    System.out.println("What should I call you?");
    String eName = e.nextLine();
    System.out.println("Hello, " + eName + ". Your hourly wage is $15 per hour. You work 3 days of the week with 8 hour shifts. You get paid biweekly.");
  }
}
