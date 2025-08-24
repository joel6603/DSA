public class First{
  public static void main(String[] args) {
    int A[] = {1,1,2,3,4,2,5,8};
    int hashArray[] = new int[9];
    for(int i=0;i<A.length;i++){
      hashArray[A[i]]++;
    }
    for(int i=0;i<hashArray.length;i++){
      System.out.println(hashArray[i]); 
    }
  }
}