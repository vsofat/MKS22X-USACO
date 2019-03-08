import java.io.*;
import java.util.*;

public class USACO{

  public static void main(String[] args) {

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
        int[][] board = new int[R][C];
        for (x = 0; x < len; x ++){
          for (y = 0; y < x.length; y++){
            Strin
          //   board[x][y] =
          }
        }
      }
    }

  }
}
