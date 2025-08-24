import java.util.*;
public class Insertionsort{
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the number of elements in the array to be sorted");
      int size= sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("the original array is "+ Arrays.toString(arr));
      for(int i=1;i<size;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
          int temp =arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
          j--;
        }
      }
      System.out.println("the sorted array is : "+ Arrays.toString(arr));
    }
  }
}
