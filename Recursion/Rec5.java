import java.util.*;
public class Rec5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int snum = sc.nextInt();
    System.out.println(fun(snum));
  }
  public static int fun(int num) {
    if(num < 1) return 0;
    return num + fun(num-1);
  }
}
