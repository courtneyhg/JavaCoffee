import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class TiltMaze {
  Scanner t = new Scanner(System.in);
  // ArrayList <ArrayList<String>> maze = new ArrayList<ArrayList<String>>();

  ArrayList<String> mazeArray = new ArrayList<>();
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
          printMaze();
      }
      catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
    public void printMaze() {
      for (int row = 0; row <mazeArray.size(); row++) {
          System.out.println(mazeArray.get(row));
      }
    }

  public void mazePlay() {
    createMaze();
    System.out.println("\nDirections:\n\t- To move the * up, enter w key into terminal.\n\t- To move left, enter a.\n\t- To move down, enter s.\n\t- To move right, enter d.\n\t- You stop moving when you come into a corner.");
    System.out.print("Enter your key of choice: ");
    if (t.nextLine().equals("d")) {
      int indexToLeft = (mazeArray.indexOf("|") - 1);
      mazeArray.set(indexToLeft, "*");
      printMaze();
    }
  }


}//end class
