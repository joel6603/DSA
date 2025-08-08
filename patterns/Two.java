import java.util.*;
public class Two{
  public static void main(String a[]) {
    try(Scanner sc = new Scanner(System.in)){
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
      int n = sc.nextInt();
      pattern2(n);
    }
  }
  }
  public static void pattern2(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
