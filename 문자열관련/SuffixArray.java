import java.util.Arrays;

public class SuffixArray {
  private Suffix[] suffixes;

  public SuffixArray(String text) {
    this.suffixes = new Suffix[text.length()];
    for (int i = 0; i < text.length(); i++)
      suffixes[i] = new Suffix(text, i);
    Arrays.sort(suffixes);
  }

  private static class Suffix implements Comparable<Suffix> {
    private final String text;
    private final int index;

    private Suffix(String text, int index) {
      this.text = text;
      this.index = index;
    }
    private int length() {
      return text.length() - index;
    }
    private char charAt(int i) {
      return text.charAt(index + i);
    }

    public int compareTo(Suffix that) {
      if (this == that) return 0;  // optimization
      int N = Math.min(this.length(), that.length());
      for (int i = 0; i < N; i++) {
        if (this.charAt(i) < that.charAt(i)) return -1;
        if (this.charAt(i) > that.charAt(i)) return +1;
      }
      return this.length() - that.length();
    }

    public String toString() {
      return text.substring(index);
    }
  }

  public int length() {
    return suffixes.length;
  }

  public int index(int i) {
    if (i < 0 || i >= suffixes.length) throw new IndexOutOfBoundsException();
    return suffixes[i].index;
  }

  public int lcp(int i) {
    if (i < 1 || i >= suffixes.length) throw new IndexOutOfBoundsException();
    return lcp(suffixes[i], suffixes[i-1]);
  }

  private static int lcp(Suffix s, Suffix t) {
    int N = Math.min(s.length(), t.length());
    for (int i = 0; i < N; i++) {
      if (s.charAt(i) != t.charAt(i)) return i;
    }
    return N;
  }

  public String select(int i) {
    if (i < 0 || i >= suffixes.length) throw new IndexOutOfBoundsException();
    return suffixes[i].toString();
  }

  public static void main(String[] args) {
    String s = "mississipi".replaceAll("\\s+", " ").trim();
    SuffixArray suffix = new SuffixArray(s);


    System.out.println("  i ind lcp rnk select");
    System.out.println("---------------------------");

    for (int i = 0; i < s.length(); i++) {
      int index = suffix.index(i);
      String ith = "\"" + s.substring(index, Math.min(index + 50, s.length())) + "\"";
      if (i == 0) {
        System.out.printf("%3d %3d %3s  %s\n", i, index, "-", ith);
      }
      else {
        int lcp = suffix.lcp(i);
        System.out.printf("%3d %3d %3d  %s\n", i, index, lcp, ith);
      }
    }
  }
}
