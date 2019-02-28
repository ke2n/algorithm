package string;

import java.util.Scanner;

public class String03_Croatian {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    for(int i = 0; i < arr.length; i++){
      line = line.replaceAll(arr[i], "a");
    }

    System.out.println(line.length());
  }
}
