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
  String rowReplace;

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

  public void moveUp() {
    if (!(mazeArray.get(yCord-1).substring(xCord, xCord+1).contains("_"))) {
      rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      mazeArray.set(yCord, rowReplace);
      rowReplace = replaceChar(mazeArray.get(yCord-1), '*', xCord);
      yCord--;
      if (mazeArray.get(yCord).substring(xCord, xCord+1).contains("‾")) {
        mazeArray.set(yCord, rowReplace);
        rowReplace = replaceChar(mazeArray.get(yCord-1), '_', xCord);
        mazeArray.set(yCord-1, rowReplace);
        printMaze();
        makeChoice();
      }
      mazeArray.set(yCord, rowReplace);
      moveUp();
    }
    else if ((mazeArray.get(yCord-1).substring(xCord, xCord+1).contains("_"))) {
      printMaze();
      makeChoice();
    }
  } //end moveUp

  public void moveLeft() {
    if (!(mazeArray.get(yCord).substring(xCord-1, xCord).contains("|"))) {
      rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      mazeArray.set(yCord, rowReplace);
      rowReplace = replaceChar(mazeArray.get(yCord), '*', xCord-1);
      xCord--;
      System.out.println(rowReplace);
      System.out.println(yCord);
      System.out.println(xCord);
      if (mazeArray.get(yCord).substring(xCord, xCord+1).contains("_")) {
        mazeArray.set(yCord, rowReplace);
        rowReplace = replaceChar(mazeArray.get(yCord+1), '‾', xCord);
        mazeArray.set(yCord+1, rowReplace);
        moveLeft();
      }
      if (mazeArray.get(yCord).substring(xCord, xCord+1).contains("‾")) {
        rowReplace = replaceChar(mazeArray.get(yCord-1), '_', xCord);
        mazeArray.set(yCord-1, rowReplace);
        moveLeft();
      }
      mazeArray.set(yCord, rowReplace);
      moveLeft();
    }
    else if (mazeArray.get(yCord).substring(xCord-1, xCord).contains("|")) {
      printMaze();
      makeChoice();
    }
  } //end moveLeft;

  public void moveDown() {
    if (!(mazeArray.get(yCord+1).substring(xCord, xCord+1).contains("‾"))) {
      rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      mazeArray.set(yCord, rowReplace);
      rowReplace = replaceChar(mazeArray.get(yCord+1), '*', xCord);
      mazeArray.set(yCord+1, rowReplace);
      yCord++;
      moveDown();
      // if (mazeArray.get(yCord).substring(xCord, xCord+1).contains("_")) {
      //   mazeArray.set(yCord, rowReplace);
      //   rowReplace = replaceChar(mazeArray.get(yCord-1), '‾', xCord);
      //   mazeArray.set(yCord+1, rowReplace);moveDown();
      // }
      // mazeArray.set(yCord, rowReplace);
      // moveDown();
    }
    else if ((mazeArray.get(yCord+1).substring(xCord, xCord+1).contains("‾"))) {
      printMaze();
      makeChoice();
    }
  } //end moveDown

  public void moveRight() {
    if (!(mazeArray.get(yCord).substring(xCord+1, xCord+2).contains("|"))) {
      rowReplace = replaceChar(mazeArray.get(yCord), ' ', xCord);
      mazeArray.set(yCord, rowReplace);
      rowReplace = replaceChar(mazeArray.get(yCord), '*', xCord+1);
      xCord++;
      System.out.println(rowReplace);
      System.out.println(yCord);
      System.out.println(xCord);
      if (mazeArray.get(yCord).substring(xCord, xCord+1).contains("‾")) {
        rowReplace = replaceChar(mazeArray.get(yCord-1), '_', xCord);
        mazeArray.set(yCord-1, rowReplace);
        moveRight();
      }
      if (mazeArray.get(yCord).substring(xCord, xCord+1).contains("_")) {
        mazeArray.set(yCord, rowReplace);
        rowReplace = replaceChar(mazeArray.get(yCord+1), '‾', xCord);
        mazeArray.set(yCord+1, rowReplace);
        if (yCord == 4 && xCord == 8) {
          rowReplace = replaceChar(mazeArray.get(yCord+1), 'ō', xCord);
          mazeArray.set(yCord+1, rowReplace);
        }
        moveRight();
      }
      mazeArray.set(yCord, rowReplace);
      moveRight();
    }
    else if (mazeArray.get(yCord).substring(xCord+1, xCord+2).contains("|")) {
      printMaze();
      makeChoice();
    }
  } //end moveRight

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

    System.out.print("Enter your key of choice: ");
    while(true) {
      String wasd = t.nextLine();
      if (wasd.equals("w")) {
        moveUp();
      }
      else if (wasd.equals("a")) {
        moveLeft();
      } //end a
      else if (wasd.equals("s")) {
        moveDown();
      }
      else if (wasd.equals("d")) {
        moveRight();
      } //end d
      System.out.print("Choose a valid option: ");
    }
  } //end makeChoice

  public void mazePlay() {
    createMaze();
    printMaze();
    System.out.println("\nDirections:\n\t- To move the '*' up, enter the w key into terminal.\n\t- To move left, enter a.\n\t- To move down, enter s.\n\t- To move right, enter d.\n\t- You stop moving when you come into a corner or a dead end.");
    makeChoice();
  } //end mazePlay
}//end class
