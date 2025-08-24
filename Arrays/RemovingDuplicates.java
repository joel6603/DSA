import java.util.*;
public class RemovingDuplicates {
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
  System.out.println(array);
  }
  public static int check(ArrayList<Integer> array,int num) {
    System.out.println(array);
    int i=0;
    for(int j=1;j<array.size();j++){
      if(array.get(j)!=array.get(i)){
        i++;
        array.add(i,array.get(j));
      }
    } 
    return i+1;
  }
}
