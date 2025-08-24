import java.util.*;;
public class Rec3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int snum = sc.nextInt();
    fun(1,snum);
  }
  public static void fun(int start, int end){
    if(start>end) return;
    System.out.println("joel");
    fun(start+1, end);
  }
}
