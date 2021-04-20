package SortStrategy.SortImplements;

import SortStrategy.SortInterface.Sort;
import SortStrategy.SortInterface.SortHandle;

public class SelectSorter implements Sort {
    private int length = 0;
    private SortHandle itsSortHandle = null;
  
     // 类的构造方法
    public SelectSorter(SortHandle handle)
    {
      itsSortHandle = handle;
    }

    @Override
    public void sort(Object array) {
        // TODO Auto-generated method stub
        System.out.println("选择");
        itsSortHandle.setArray(array);
        length = itsSortHandle.length();
        for(int i = 0; i < length; i++){
            int index = i;
            for(int j = i + 1; j < length; j++){
                if(itsSortHandle.outOfOrderTwo(index, j)){
                    index = j;
                }
            }
            itsSortHandle.swapTwo(i, index);
        }
    }
    
} 