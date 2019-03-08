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
    Scanner scanner = new Scanner(filename);
    int R;
    int C;
    int E;
    int N;
    int[] first = new int[4];
    for(int index = 0; index < 4;index++){
      first[index] = Integer.parseInt(scanner.next());
    }
    R = first[0];
    C = first[1];
    E = first[2];
    N = first[3];
    int[][] board = new int[R][C];
    while (scanner.hasNextLine()){
    int len = scanner.nextLine().length();
    String info = scanner.nextLine();
    for (int row = 0; row < len; row++){
      if (row == 0){
      }
      else if (row == len-2){
        String instructions1[] = info.split(" ");
      }
      else if (row == len-1){
        String instructions2[] = info.split(" ");
      }
      else {
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
