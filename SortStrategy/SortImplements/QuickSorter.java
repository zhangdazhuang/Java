package SortStrategy.SortImplements;


import SortStrategy.SortInterface.Sort;
import SortStrategy.SortInterface.SortHandle;

public class QuickSorter implements Sort {
    private int length = 0;
    private SortHandle itsSortHandle = null;
  
    public QuickSorter(SortHandle handle)
    {
      itsSortHandle = handle;
    }

    @Override
    public void sort(Object array) {
        // TODO Auto-generated method stub
        System.out.println("快速");
        itsSortHandle.setArray(array);
        length = itsSortHandle.length();

        QuickSort(array,0, length-1);
        
    }
    public int partition(Object array,int first,int end){
        int i = first;
        int j = end;
        while(i<j){
            while(i<j && itsSortHandle.outOfOrderTwo(j, i)){j--;}
            if(i<j){
                itsSortHandle.swapTwo(i, j);
                i++;
            }
            while(i<j && itsSortHandle.outOfOrderTwo(j, i)){i++;}
            if(i<j){
                itsSortHandle.swapTwo(i, j);
                j--;
            }
        }
        return i;
    }
    public void QuickSort(Object array,int first,int end){
        if(first < end){
            int pivot = partition(array, first, end);
            QuickSort(array,first,pivot-1);
            QuickSort(array,pivot+1,end);
        }
    }
    
} 