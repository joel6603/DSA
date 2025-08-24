import java.util.*;
public class Arraylist{
  public static void main(String[] args) {
    List<Integer> alist = new ArrayList<>();
    alist.add(8);
    alist.add(4);
    alist.add(5);
    for(int i: alist){
      System.out.println(i);
    }
    System.out.println("element that got replaced is :"+ alist.set(1,100));
    System.out.println(alist);
  }
}