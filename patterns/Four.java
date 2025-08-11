import java.util.*;
public class Four{
  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for( int i =0;i<num;i++){
      for(int j=0;j<=i;j++){
        System.out.print((i+1)+" ");
      }
      System.out.println("");
    }
  }
}
