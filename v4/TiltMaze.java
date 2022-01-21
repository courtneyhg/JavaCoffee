import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class TiltMaze {
  Scanner t = new Scanner(System.in);
  ArrayList <ArrayList<String>> maze = new ArrayList<ArrayList<String>>();

  public void createMaze() {
    for (int row = 0; row < 10; row++) {
      maze.add(new ArrayList<String>());
      for (int col = 0; col < 10; col++) {
        maze.get(row).add("-");
      }
    }
  }

  public void printMaze() {
    for (int roow = 0; r)
  }

  // public void mazePlay() {
  //   createMaze();
  // }
}//end class
