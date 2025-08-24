import java.util.*;
class Rec1Function{
  public void printNum(int snum ,int end) {
    System.out.println(snum);
    if(snum<end){
      printNum( snum+1, end);
    }
    return ;
  }
}
public class Rec1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int snum = sc.nextInt();
    new Rec1Function().printNum(snum ,10);
  }
}