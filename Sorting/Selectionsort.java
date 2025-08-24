import java.net.SocketPermission;
import java.util.*;
public class Selectionsort{
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the number of elements in the array to be sorted");
      int size= sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("the original array is "+ Arrays.toString(arr));
      for(int i=0;i<size-1;i++){
        int min=i;
        for(int j=i+1;j<size;j++){
          if(arr[j]< arr[min]){
            min =j;
          }
        }
       int temp =arr[i];
       arr[i]=arr[min];
       arr[min]=temp;
      }
      System.out.println("the sorted array is : "+ Arrays.toString(arr));
    }
  }
}