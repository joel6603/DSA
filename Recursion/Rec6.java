public class Rec6 {
  public static void main(String[] args) {
    int A[] = {1,2,3,4};
    int l= A.length;
    for(int i=0;i<l;i++){
      System.out.print(i+ " ");
    }
    reverse(0,A,l);
    for(int i=0;i<l;i++){
      System.out.print(A[i]+ " ");
    }

  }
  public static void reverse(int i, int A[], int l) {
    if(i>= l/2){ return;}
    A[l-i-1]+=A[i];
    A[i]=A[l-i-1]-A[i];
    A[l-i-1]-=A[i];
    reverse(i+1,A,l);
    
  }
}
