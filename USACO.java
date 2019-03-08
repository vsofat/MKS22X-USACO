import java.io.*;
import java.util.*;

public class USACO{

  public static void main(String[] args) {
    try {
      bronze("testCases/makelake.1.in") ;
    } catch (FileNotFoundException e) {
      System.out.println("We couldn't find the file! UH OH") ;
    } catch (Exception e) {
      System.out.println("There's an exception being thrown but it's not caused by a missing file!") ;
    }

  }

  public static int bronze (String filename) throws FileNotFoundException{
    File file = new File (filename);
    Scanner scanner = new Scanner(filename);
    while (scanner.hasNextLine()){
    int len = scanner.nextLine().length();
    String info = scanner.nextLine();
    int R = 0;
    int C = 0;
    int E = 0;
    int N = 0;
    int[][] board;
    for (int row = 0; row < len; row++){
      if (row == 0){
         String first[] = info.split(" "); // R = 0; C = 0; E = 0; N =0
         int values[] = new int[first.length];
         for(int i = 0; i < first.length;i++){
         values[i] = Integer.parseInt(first[i]);
      }
        R = values[0];
        C = values[1];
        E = values[2];
        N = values[3];
        }
      else if (row == len-2){
        String instructions1[] = info.split(" ");
      }
      else if (row == len-1){
        String instructions2[] = info.split(" ");
      }
      else {
        board = new int[R][C];
        int[] placeholder = new int[C];
        for (int x = 0; x < R; x ++){
          for (int y = 0; y < C; y++){
            String depths[] = info.split(" ");
            for(int i = 0; i < depths.length;i++){
            placeholder[i] = Integer.parseInt(depths[i]);
         }
         board[x][y]=placeholder[x];
          }
        }
      }
    }
    System.out.println(toString(board));
  }
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
