package string;

import java.util.Scanner;

/**
 * 상수
 * https://www.acmicpc.net/problem/2908
 *
 * Created by Keens on 2016-03-29.
 */
public class Main_2908 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int num_1 = in.nextInt();
    int num_2 = in.nextInt();
    int temp_1 = reverse(num_1);
    int temp_2 = reverse(num_2);

    System.out.println((temp_1 > temp_2)? temp_1 : temp_2);
  }

  public static int reverse(int num){
    return (num%10)*100 + (num/10%10)*10 + (num/100);
  }
}
