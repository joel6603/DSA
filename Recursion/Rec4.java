import java.util.*;;
public class Rec4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int snum = sc.nextInt();
    fun(snum,snum);
  }
  public static void fun(int start, int end){
    if(start<1) return;    
    fun(start-1, end);

    System.out.println(start);
  }
}
 

