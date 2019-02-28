package string;

import java.util.Scanner;

public class String02_Sed {
  private static String[] from;
  private static String[] to;

  static int f(String src, String dest) {
    if (src.equals(dest)) return 0;
    if (src.length() > dest.length()) return Integer.MAX_VALUE;
    String tmp = "";

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < from.length; ++i) {
      tmp = src.replaceAll(from[i], to[i]);
      if (!src.equals(tmp)) {
        int res = f(tmp, dest);
        if (res != Integer.MAX_VALUE)
          min = Math.min(min, 1 + res);
      }
    }

    return min;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      int n = in.nextInt();
      if (n == 0) break;

      from = new String[n];
      to = new String[n];

      for (int i = 0; i < n; ++i) {
        from[i] = in.next();
        to[i] = in.next();
      }
      String src = in.next();
      String dest = in.next();

      int res = f(src, dest);
      res = res == Integer.MAX_VALUE ? -1 : res;
      System.out.println(res);
    }

  }
}
