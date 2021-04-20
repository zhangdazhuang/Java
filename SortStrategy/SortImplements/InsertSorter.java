package SortStrategy.SortImplements;

import SortStrategy.SortInterface.Sort;
import SortStrategy.SortInterface.SortHandle;

public class InsertSorter implements Sort {
    private int length = 0;
    private SortHandle itsSortHandle = null;
  
    public InsertSorter(SortHandle handle)
    {
      itsSortHandle = handle;
    }

    @Override
    public void sort(Object array) {
        // TODO Auto-generated method stub
        System.out.println("插入");
        itsSortHandle.setArray(array);
        length = itsSortHandle.length();
        for(int i = 1; i < length; i++){
            for(int j = i ; j > 0; j--){
                if(itsSortHandle.outOfOrderTwo(j-1, j)){
                    itsSortHandle.swapTwo(j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    
} 