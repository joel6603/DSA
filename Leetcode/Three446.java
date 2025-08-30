package Leetcode;
import java.util.Arrays;
public class Three446 {
  public int[][] sortMatrix(int[][] grid) {
    int n=grid.length;

    for(int i=n-1;i>0;i--){
      int array[]=new int[i];
      int x=0;
      int y=n-i;

      for(int j=0;j<i;j++){
          array[j]=grid[x+j][y+j];
      }

      Arrays.sort(array);

      for(int j=0;j<i;j++){
          grid[x+j][y+j]=array[j];
      }
    }

      for(int i=n;i>0;i--){
      int array[]=new int[i];
      int x=n-i;
      int y=0;

      for(int j=0;j<i;j++){
          array[j]=grid[x+j][y+j];
      }

      Arrays.sort(array);

      for(int j=0;j<i;j++){
          grid[x+j][y+j]=array[i-j-1];
      }
    }

    return grid;  
  }
}
