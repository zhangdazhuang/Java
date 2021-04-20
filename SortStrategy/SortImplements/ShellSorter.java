package SortStrategy.SortImplements;


import SortStrategy.SortInterface.Sort;
import SortStrategy.SortInterface.SortHandle;

public class ShellSorter implements Sort {
    private int length = 0;
    private SortHandle itsSortHandle = null;
  
    public ShellSorter(SortHandle handle)
    {
      itsSortHandle = handle;
    }

    @Override
    public void sort(Object array) {
        // TODO Auto-generated method stub
        System.out.println("希尔");
        itsSortHandle.setArray(array);
        length = itsSortHandle.length();
        
        for(int i = length/2; i > 0 ; i /= 2){
            for(int j = i ; j < length; j++){
                for(int k = j; k > 0 && k - i >= 0; k -= i){
                    if(itsSortHandle.outOfOrderTwo(k-i, k)){
                        itsSortHandle.swapTwo(k, k-i);
                    }else{
                        break;
                    }
                }
               
            }
        }
    }
    
} 