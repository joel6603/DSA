import java.util.*;
public class Bubblesort {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the number of elements in the array to be sorted");
      int size= sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("the original array is "+ Arrays.toString(arr));
      for(int i=size-1;i>0;i--){
        int didswap =0;
        for(int j=0;j<i;j++){
          if(arr[j]> arr[j+1]){
            int temp =arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            didswap=1;
          }
          if(didswap==0){
            break;
          }
        }
      }
      System.out.println("the sorted array is : "+ Arrays.toString(arr));
    }
  }
}
