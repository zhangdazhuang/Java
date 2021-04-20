package SortStrategy.SortImplements;

import SortStrategy.SortInterface.Sort;
import SortStrategy.SortInterface.SortHandle;

public class MergeSorter implements Sort {
    private int length = 0;
    private SortHandle itsSortHandle = null;
  
    public MergeSorter(SortHandle handle)
    {
      itsSortHandle = handle;
    }

    @Override
    public void sort(Object array) {
        // TODO Auto-generated method stub
        System.out.println("归并");
        itsSortHandle.setArray(array);
        itsSortHandle.sortSpecificMethod();

    }
  
    
} 