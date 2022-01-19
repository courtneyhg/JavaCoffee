import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Customer {
  double budget = Math.round((Math.random() * 50.00) * 100)/100.0;

  public void play() {

    System.out.println("Here is your budget, use it wisely: $" + budget);

    int item = 6;
    int prices = 2;
    String[][] newArray = new String[item][prices];
    newArray[0][0] = "6 oz of cat poop coffee - ";
    newArray[0][1] = "$35.25";

    newArray[1][0] = "8 oz of cat poop coffee - ";
    newArray[1][1] = "$45.50";

    newArray[2][0] = "regular coffee - ";
    newArray[2][1] = "$3.00";

    newArray[3][0] = "macchiato - ";
    newArray[3][1] = "$3.50";

    newArray[4][0] = "flat white - ";
    newArray[4][1] = "$4.25";

    newArray[5][0] = "cuppuccino - ";
    newArray[5][1] = "$5.50";

    for(int i = 0; i < newArray.length; i++){
      System.out.print("\n");
      for(int j = 0; j <newArray[i].length; j++){
        System.out.print(newArray[i][j]);
      }
    }

  }

}
