import java.util.*;

public class Day10 {
      public static void main(String[] args) {
            int arr[][] = new int[3][3]; //row col, row = arr.length,col = arr[0].length
            Scanner s = new Scanner(System.in);
            for(int i = 0; i < 3; i++) {
                  for(int j = 0; j < arr[0].length; j++) {
                              arr[i][j] = s.nextInt();
                        }
                  }

            for(int i = 0; i < 3; i++) {
                  for(int j = 0; j < arr[0].length; j++) {
                              System.out.print(arr[i][j]+ " ");
                        }
                        System.out.println(" ");
                  }
      }
}
