package SortStrategy.SortImplements;

import SortStrategy.SortInterface.SortHandle;

public class IntSortHandle implements SortHandle
{
  private int[] array = null;

  public void swap(int index)
  {
    int temp = array[index];
    array[index] = array[index+1];
    array[index+1] = temp;
  }

  public void setArray(Object array)
  {
    this.array = (int[])array;
  }

  public int length()
  {
    return array.length;
  }

  public boolean outOfOrder(int index)
  {
    return (array[index] > array[index+1]);
  }

  @Override
  public void swapTwo(int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  @Override
  public boolean outOfOrderTwo(int index, int index2) {
      return (array[index] >= array[index2]);
  }

  @Override
  public void sortSpecificMethod() {   
    int[] arr = this.array;
    int end = arr.length - 1;
    mergeSort(arr, 0, end);
  }
  public static void mergeSort(int[] arr, int start, int end) {
      if (end - start > 0) {
          mergeSort(arr, start, (start + end) / 2);
          mergeSort(arr, (start + end) / 2 + 1, end);
          int left = start;
          int right = (start + end) / 2 + 1;
          int index = 0;
          int[] result = new int[end - start + 1];
          while (left <= (start + end) / 2 && right <= end) {
              if (arr[left] <= arr[right]) {
                  result[index] = arr[left];
                  left++;
              } else {
                  result[index] = arr[right];
                  right++;
              }
              index++;
          }
          while (left <= (start + end) / 2 || right <= end) {
              if (left <= (start + end) / 2) {
                  result[index] = arr[left];
                  left++;
              } else {
                  result[index] = arr[right];
                  right++;
              }
              index++;
          }
          for (int i = start; i <= end; i++) {
              arr[i] = result[i - start];
          }
      }
  }////
  
}