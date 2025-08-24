public class Second {
  public static void main(String[] args) {
    String message ="missisippi";
    char[] m = message.toCharArray();
    int[] charHash = new int[26];
    int l =message.length();
    for(int i=0;i<l;i++){
      charHash[m[i]-'a']++;
    }
    for(int i=0;i<26;i++){
      System.out.print(charHash[i]+" ");
    }
  }
}
