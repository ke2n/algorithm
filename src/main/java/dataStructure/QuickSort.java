package dataStructure;

/**
 * Created by Keens on 2016-03-26.
 */
public class QuickSort {
  public static void quickSort(int[] arr, int low, int high){
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];
    int i = low, j = high;
    while(i<=j) {
      while (arr[i] < pivot) i++;
      while (arr[j] > pivot) j--;
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    if(low<j) quickSort(arr, low, j);
    if(high>i) quickSort(arr, i, high);
  }
  public static void main(String[] str){
    int[] arr = {3,1,5,2,9,6};
    quickSort(arr, 0, arr.length-1);
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
