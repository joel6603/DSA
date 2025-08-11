import java.util.*;
public class Eight{
  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for( int i =0;i<num;i++){
      int col = num-i-1;
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      int star = (col)*2 + 1;
      for(int j=0;j<star;j++){
        System.out.print("*");
      }
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}