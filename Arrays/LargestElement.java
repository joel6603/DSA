import java.util.*;
public class LargestElement{
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
    System.out.println(array);
    for(int j=0;j<num;j++){
      if(array.get(i)<array.get(j)){
        i=j;
      }
    }
    System.out.println(array.get(i));
  }
}