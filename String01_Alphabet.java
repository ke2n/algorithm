import java.util.Scanner;

public class String01_Alphabet {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String str = in.next();
    for(char i='a'; i <= 'z'; i++){
      int cnt = 0;
      for(int j=0; j < str.length(); j++){
        if(i == str.charAt(j)) break;
        else if(j == str.length()-1) cnt = -1;
        else cnt++;
      }
      System.out.print(cnt + " ");
    }
  }
}
