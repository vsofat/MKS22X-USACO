import java.io.*;
import java.util.*;

public class USACO{

  public static void main(String[] args) {
    try {
      System.out.println(bronze("testCases/makelake.1.in")) ;
    } catch (FileNotFoundException e) {
      System.out.println("Where's the file?!") ;
    }
    catch (Exception e) {
      System.out.println("File is good! But you're not!") ;
    }
    try {
      System.out.println(bronze("testCases/makelake.2.in")) ;
    } catch (FileNotFoundException e) {
      System.out.println("Where's the file?!") ;
    }
    catch (Exception e) {
      System.out.println("File is good! But you're not!") ;
    }
    try {
      System.out.println(bronze("testCases/makelake.3.in")) ;
    } catch (FileNotFoundException e) {
      System.out.println("Where's the file?!") ;
    }
    catch (Exception e) {
      System.out.println("File is good! But you're not!") ;
    }
    try {
      System.out.println(bronze("testCases/makelake.4.in")) ;
    } catch (FileNotFoundException e) {
      System.out.println("Where's the file?!") ;
    }
    catch (Exception e) {
      System.out.println("File is good! But you're not!") ;
    }
    try {
      System.out.println(bronze("testCases/makelake.5.in")) ;
    } catch (FileNotFoundException e) {
      System.out.println("Where's the file?!") ;
    }
    catch (Exception e) {
      System.out.println("File is good! But you're not!") ;
    }
  }

  public static int bronze (String filename) throws FileNotFoundException{
    File file = new File (filename);
    Scanner input = new Scanner(file);
    int R;
    int C;
    int E;
    int N;
    int total = 0;
    int[] first = new int[4];
    for(int index = 0; index < 4; index++){
      first[index] = Integer.parseInt(input.next());
    }
    R = first[0];
    C = first[1];
    E = first[2];
    N = first[3];

  //  System.out.println("value of R: " + R);
  //  System.out.println("value of C: " + C);
  //  System.out.println("value of E: " + E);
  // System.out.println("value of N: " + N);

    int[][] board = new int[R][C];
    //adding the values to the 2D array
    for (int rows = 0 ; rows < R ; rows++) {
      for (int cols = 0 ; cols < C ; cols++) {
        board[rows][cols] = Integer.parseInt(input.next()) ;
      }
    }

    //System.out.println(toString(board));
  //  System.out.println(" 28 25 20 32 34 36 \n 27 25 20 20 30 34 \n 24 20 20 20 20 30 \n  20 20 14 14 20 2");

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

      //System.out.println("value of max: " + maxVal);

      for (int row = 0; row < startRow + 3; row++){
        for (int col = 0; col < startCol + 3; col++){
          int diff = maxVal - board[row][col];
          if (diff < stompVal){
            board[row][col] = maxVal - stompVal;
          }
        }
      }}

      for (int row = 0; row < R; row ++){
        for (int col = 0; col < C; col++){
          int currentDepth  = board[row][col];
          if (E - currentDepth > 0){
            total += E - currentDepth;
          }
        }
      //  System.out.println("totalDiff is : " + total);


    //  System.out.println(toString(board)); // should be modified

    //  System.out.println("\n 28 25 20 32 32 32 \n 27 25 20 20 30 32 \n 24 20 20 20 20 30 \n 20 20 14 14 20 20");

    //   System.out.println("\n 18 18 18 32 32 32 \n 18 18 18 20 30 32 \n 18 18 18 20 20 30 \n 20 20 14 14 20 20");

    }
    return total * 72 * 72;
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
