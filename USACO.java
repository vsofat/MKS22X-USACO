import java.io.*;
import java.util.*;

public class USACO{

  public static void main(String[] args) {
    try {
      bronze("testCases/makelake.1.in") ;
    } catch (FileNotFoundException e) {
      System.out.println("Where's the file?!") ;
    } /*catch (Exception e) {
      System.out.println("File is good! But you're not!") ;
    } */

  }

  public static int bronze (String filename) throws FileNotFoundException{
    File file = new File (filename);
    Scanner input = new Scanner(file);
    int R;
    int C;
    int E;
    int N;
    int[] first = new int[4];
    for(int index = 0; index < 4; index++){
      first[index] = Integer.parseInt(input.next());
    }
    R = first[0];
    C = first[1];
    E = first[2];
    N = first[3];
    int[][] board = new int[R][C];
    //adding the values to the 2D array
    for (int rows = 0 ; rows < R ; rows++) {
      for (int cols = 0 ; cols < C ; cols++) {
        board[rows][cols] = Integer.parseInt(input.next()) ;
      }
    }

    for (int modify = 0; modify < N; modify++){
      int startRow = Integer.parseInt(input.next()) - 1;
      int startCol = Integer.parseInt(input.next()) - 1;
      int stompVal = Integer.parseInt(input.next());
      int maxVal = 0;
      for (int row = 0; row < startRow + 3; row++){
        for (int col = 0; col < startCol + 3; col++){
            if (board[row][col] > maxVal){
              maxVal = board[row][col];
            } // we now have a max value
      }
    }
    System.out.println("value of max: " + maxVal);
  }

    System.out.println(toString(board));
    System.out.println("value of R: " + R);
    System.out.println("value of C: " + C);
    System.out.println("value of E: " + E);
    System.out.println("value of N: " + N);

    return 0;
  }

  public static String toString(int[][]array){
    String result = "";
    for (int row = 0; row < array.length; row++){
      for (int col = 0; col < array[0].length; col++){
        result += "  " + array[row][col];
      }
      result += "\n";
    }
    return result;
  }

}
