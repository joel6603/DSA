import java.util.*;
public class SecondLargest{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    List <Integer> array = new ArrayList<>();
    System.out.println("Enter the number of elements in the array: ");
    int num = sc.nextInt();
    for(int i=0;i<num;i++){
      int element = sc.nextInt();
      array.add(element);
    }
    int i=0;
    int second=-1;
    System.out.println(array);
    for(int j=0;j<num;j++){
      if(array.get(i)<array.get(j)){
        second = i;
        i=j;
      }
      else if(array.get(j)<array.get(i) && array.get(i)>array.get(second)){
        second=j;
      }
    }
    System.out.println(array.get(second));
  }
}