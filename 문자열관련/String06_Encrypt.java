import java.util.Scanner;

public class String06_Encrypt {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    String result = "";

    int testno = sc.nextInt();
    if (testno < 1 || testno > 10) {
      System.out.println("Error");
      System.exit(0);
    }

    for (int i = 0; i < testno; i++) {
      str = sc.next();
      str = str.replaceAll(" ", "");
      String tempEven = "", tempOdd = "";

      for (int j = 0; j < str.length(); j++) {
        if (j % 2 == 0) {
          tempEven += str.substring(j, j + 1);
        } else {
          tempOdd += str.substring(j, j + 1);
        }
      }

      result = tempEven + tempOdd;
      System.out.println(result);
    }
  }
}
