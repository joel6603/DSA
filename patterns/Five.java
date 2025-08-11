import java.util.*;
public class Five{
  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for( int i =0;i<num;i++){
      int col = num-i;
      for(int j=0;j<col;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}