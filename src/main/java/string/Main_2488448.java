package string;

import java.util.Scanner;

/**
 * KMP는 왜 KMP일까?
 * https://www.acmicpc.net/problem/2902
 *
 * Created by Keens on 2016-03-16.
 */
public class Main_2488448 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) < 'a'){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

}