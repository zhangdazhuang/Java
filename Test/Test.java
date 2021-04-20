package Test;

import java.util.Arrays;

public class Test {
    // public static void main(String[] args) {
    //     // String name = "reflectionTest";
    //     // Class c1 = name.getClass();
    //     // System.out.println(c1.getName());
    // }  
    public static void main(String[] args) {

        // int arr[] = {7, 5, 3, 2, 4, 1,6,45,76,87,12};
        double arr[] = {1.7, 5.7, 9.3, 2, 4, 1,6,4.5,7.6,8.7,1.2};

        int end = arr.length - 1;
        mergeSort(arr, 0, end);
        System.out.println(Arrays.toString(arr));
    }

    // public static void mergeSort(int[] arr, int start, int end) {
    public static void mergeSort(double[] arr, int start, int end) {
        if (end - start > 0) {
            mergeSort(arr, start, (start + end) / 2);
            mergeSort(arr, (start + end) / 2 + 1, end);
            int left = start;
            int right = (start + end) / 2 + 1;
            int index = 0;
            // int[] result = new int[end - start + 1];
            double[] result = new double[end - start + 1];
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
    }
    }    

// }
// enum Color
// {
//     RED, GREEN, BLUE,BA;
 
//     // 构造函数
//     private Color()
//     {
//         System.out.println("Constructor called for : " + this.toString());
//     }
 
//     public void colorInfo()
//     {
//         System.out.println("Universal Color");
//     }
// }
 
// public class Test
// {    
//     // 输出
//     public static void main(String[] args)
//     {
//         Color c1 = Color.BA;
//         // System.out.println(c1);
//         c1.colorInfo();
//     }
// }

/////////////////////
/*
void Merge(int r[],int r1[],int s, int m,int t){
    int i = s;
    int j = m+1;
    int k = s;
    while(i<=m && j<=t){
      if (r[i] <= r[j]) r1[k++] = r[i++];  
      else r1[k++] = r[j++]; 
    }
    if (i<=m) while(i<=m)
        r1[k++] = r[i++];   
    else while(j<=t)
        r1[k++] = r[j++]; 
  }

  void MergePass(int r[],int r1[],int n, int h){
    int i = 1;
    while(i<=n-2*h+1){
      Merge(r, r1, i, i+h-1, i+2*h-1);
      i += 2*h;
    }
    if(i<n-h+1)Merge(r, r1, i, i+h-1,n);
    else for(int k=i; k<=n;k++)
        r1[k] = r[k];
    
  }
  void MergeSort(int r[],int r1[],int n){
    int h = 1;
    while(h<n){
      MergePass(r, r1, n, h);
      h = 2 * h;
      MergePass(r1, r, n, h);
      h = 2 * h;
    }
  }*/
/////////////////