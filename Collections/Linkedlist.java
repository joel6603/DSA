import java.util.*;
public class Linkedlist {
  public static void main(String[] args) {
    List<Integer> llist = new LinkedList<>();
    llist.add(1);
    llist.add(2);
    llist.add(3);
    //1,2,3
    ListIterator<Integer> iterator = llist.listIterator();
    System.out.println(iterator.next());
    System.out.println(iterator.next());
    System.out.println(iterator.previous());

    //convertig to a new array
    Integer [] arr = llist.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arr));
  }
}
