package dataStructure;

/**
 * Created by Keens on 2016-03-22.
 */
public class MergeSort {
  public static void sort(int[] arr, int low, int high){
    int N = high - low;
    if(N <= 1) return;
    int mid = low + N/2;

    sort(arr, low, mid);
    sort(arr, mid, high);

    int[] temp = new int[N];
    int i = low, j = mid;

    for(int k = 0; k < N; k++){
      if(i == mid) temp[k] = arr[j++];
      else if(j == high) temp[k] = arr[i++];
      else if(arr[j] < arr[i]) temp[k] = arr[j++];
      else temp[k] = arr[i++];
    }

    for(int k = 0; k < N; k++){
      arr[low+k] = temp[k];
    }
  }

  public static void main(String[] args){
    int[] arr = {3,1,2,5,4,9,6};

    sort(arr, 0, arr.length);

    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
