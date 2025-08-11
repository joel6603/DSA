import java.util.*;
public class Ten{
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
    for(int i=0;i<=2*n-1;i++){
      int stars =i;
      if(i>=n) stars=2*n-i;
      for(int j=0;j<stars;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}