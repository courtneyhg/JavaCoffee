import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class TiltMaze {
  Scanner t = new Scanner(System.in);
  ArrayList<String> mazeArray = new ArrayList<>();
  int xCord, yCord; // the x and y coordinates of the * symbol
  int wallCord, floorCord, ceilingCord; // the coordinates of the barriers that * will face
  // ArrayList <ArrayList<String>> maze = new ArrayList<ArrayList<String>>();

  public void createMaze() {
    // ArrayList <ArrayList<String>> maze = new ArrayList<ArrayList<String>>();
    // maze.add(new ArrayList<String>(Arrays.asList("_________")));
    // maze.add(new ArrayList<String>(Arrays.asList("|*_ |   |")));
    // maze.add(new ArrayList<String>(Arrays.asList("|      _|")));
    // maze.add(new ArrayList<String>(Arrays.asList("|  | _  |")));
    // maze.add(new ArrayList<String>(Arrays.asList("|   _  _|")));
    // maze.add(new ArrayList<String>(Arrays.asList("|    | o|")));
    // maze.add(new ArrayList<String>(Arrays.asList("‾‾‾‾‾‾‾‾‾")));
    // for (int row = 0; row < maze.size(); row++) {
    //     System.out.println(maze.get(row));
    // }

      try (Scanner s = new Scanner(new FileReader("maze.txt"))) {
          while (s.hasNext()) {
              mazeArray.add(s.nextLine());
          }
      }
      catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
    // print the maze duh
    public void printMaze() {
      for (int row = 0; row < mazeArray.size(); row++) {
          System.out.println(mazeArray.get(row));
      }
    }
    //  replace String with char at certain index
    public String replaceChar(String str, char ch, int index) {
      return str.substring(0, index) + ch + str.substring(index+1);
    }

    public void makeChoice() {
      for (int roww = 1; roww < (mazeArray.size() - 1); roww++) {
        if (mazeArray.get(roww).contains("*")) {
          yCord = roww;
          xCord = mazeArray.get(roww).indexOf("*");
        }
        else if (mazeArray.get(roww).substring(1,9).contains("|")) {
          wallCord = mazeArray.get(yCord).substring(1,9).indexOf("|");
        }
        else if (mazeArray.get(roww).substring(1,9).contains("_")) {
          floorCord = mazeArray.get(yCord).substring(1,9).indexOf("_");
        }
        else if (mazeArray.get(roww).substring(1,9).contains("‾")) {
          ceilingCord = mazeArray.get(yCord).substring(1,9).indexOf("‾");
        }
      }

      // if (t.nextLine().equals("w")) {
      //   String rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      //   mazeArray.set(yCord, rowReplace);
      //   rowReplace = replaceChar(mazeArray.get(yCord), '*', wallCord);
      //   mazeArray.set(yCord, rowReplace);
      //   printMaze();
      // }
      // else if (t.nextLine().equals("a")) {
      //   String rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      //   mazeArray.set(yCord, rowReplace);
      //   rowReplace = replaceChar(mazeArray.get(yCord), '*', wallCord);
      //   mazeArray.set(yCord, rowReplace);
      //   printMaze();
      // }
      // if (t.nextLine().equals("s")) {
      //   while (yCord < (mazeArray.size() - 1)) {
      //     String rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      //     mazeArray.set(yCord, rowReplace);
      //     if (mazeArray.get(yCord).substring(1,9).contains("‾")) {
      //       rowReplace = replaceChar(mazeArray.get(yCord), '*', floorCord+1);
      //       mazeArray.set(yCord, rowReplace);
      //     }
      //     yCord++;
      //   }
      //   // while (mazeArray.get(yCord).substring(xCord,xCord +1) ) {
      //   //   String colMove =
      //   // rowReplace = replaceChar(mazeArray.get(yCord), '*', floorCord);
      //   // mazeArray.set(yCord, rowReplace);
      //   printMaze();
      //   // System.out.print(rowReplace);
      // }
      if (t.nextLine().equals("d")) {
        String rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
        mazeArray.set(yCord, rowReplace);
        rowReplace = replaceChar(mazeArray.get(yCord), '*', wallCord);
        mazeArray.set(yCord, rowReplace);
        printMaze();
        // System.out.print("Enter your key of choice: ");
      }
    }

  public void mazePlay() {
    createMaze();
    printMaze();
    System.out.println("\nDirections:\n\t- To move the '*' up, enter the w key into terminal.\n\t- To move left, enter a.\n\t- To move down, enter s.\n\t- To move right, enter d.\n\t- You stop moving when you come into a corner or a dead end.");
    System.out.print("Enter your key of choice: ");
    makeChoice();
  }


}//end class
