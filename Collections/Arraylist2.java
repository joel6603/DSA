import java.util.*;
public interface Arraylist2 {
  public static void main(String[] args) {
    List<Integer> alist = new LinkedList<>();
    alist.add(4);
    alist.add(5);
    alist.add(6);
    alist.add(7);
    alist.add(8);
    System.out.println(alist);
    System.out.println(alist.subList(0, 2));
    List<Integer> aList2 = new LinkedList<>(alist);
    System.out.println(aList2);
    alist.addAll(aList2);
    System.out.println(alist);
  }
}
