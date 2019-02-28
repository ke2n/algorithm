package string;

public class String04_Palindrome {

  public static boolean isPal(String str){
    if(str.length() == 0 || str.length() == 1) return true;
    if(str.charAt(0) == str.charAt(str.length()-1)) return isPal(str.substring(1, str.length()-1));
    return false;
  }

  public static String makePal(String text){
    String prefix = "";
    int i = 0;
    while(!isPal(text+prefix)){
      prefix = text.charAt(i) + prefix;
      i++;
    }
    return text+prefix;
  }

  public static void main(String[] args){
    String text = "testms";

    System.out.println(makePal(text));
  }
}
