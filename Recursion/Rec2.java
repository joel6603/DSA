public class Rec2 {
  public static void main(String[] args) {
    int count =0;
    printName(count);
  }
  public static void printName(int count){
    if(count==5) return;
    System.out.println("joel");
    count++;
    printName(count);
  }
}
