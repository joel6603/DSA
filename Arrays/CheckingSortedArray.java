import java.util.*;
public class CheckingSortedArray {
  public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  ArrayList <Integer> array = new ArrayList<>();
  System.out.println("Enter the number of elements in the array: ");
  int num = sc.nextInt();
  for(int i=0;i<num;i++){
    int element = sc.nextInt();
    array.add(element);
  }
  System.out.println(check(array,num));
  }
  public static boolean check(ArrayList<Integer> array,int num) {
    System.out.println(array);
    for(int j=1;j<num;j++){
      if(array.get(j)<=array.get(j-1)){
        
      }
      else{ return true;}
    } 
    return false;
  }
}
