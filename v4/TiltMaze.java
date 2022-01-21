import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class TiltMaze {
  Scanner t = new Scanner(System.in);
  ArrayList <ArrayList<String>> maze = new ArrayList<ArrayList<String>>();

  public void createMaze() {
    maze.get(0).add("-");
    System.out.println(maze);
  }

  public void mazePlay() {
    createMaze();
  }
}//end class
