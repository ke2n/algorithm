import java.util.Scanner;

public class String07_Histogram {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cnt = 0;
    String[] lineVal = new String[4];
    int[] arr = new int[100];

    while(cnt < 4){
      lineVal[cnt] = in.nextLine();
      cnt++;
    }

    //arr에 각 알파뱃 값들을 저장하여 취합
    for(int i = 0; i < lineVal.length; i++){
      for(int j = 0; j < lineVal[i].length(); j++){
        arr[lineVal[i].charAt(j)] += 1;
      }
    }

    int k = arr['A'];
    //각 알파벳에 해당하는 것중 최대값 구하기
    for (int i = 'A'; i <= 'Z'; i++) {
      if(k < arr[i]) {
        k = arr[i];
      }
    }

    for (int i = k; i > 0; i--) {
      for (int j = 'A'; j <= 'Z'; j++) {
        if (arr[j] >= i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    for (int i = 'A'; i <= 'Z'; ++i) {
      System.out.printf("%c ", i);
    }
  }
}
