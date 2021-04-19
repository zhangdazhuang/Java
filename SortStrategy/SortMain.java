package SortStrategy;

import org.junit.Test;
import java.util.Arrays;

public class SortMain {

    int[] arrayInt = {9,8,7,6,5,4,3,2,1,0,34,56,223,56};
    Double[] arrayDou = {0.9,8.3,0.7,6.5,5.1,5.4,9.3,2.6,1.0,0.6,3.4,1.56,2.23,9.56};

    @Test
    public void BubbleSorterInt(){
        //反射获得SortHandle接口的实现类IntSortHandle的对象
        SortHandle IntSortHandle= SortFactory.getSortHandleInterface("SortStrategy.IntSortHandle");
        Sort BubbleSorter = SortFactory.getSortInterface("SortStrategy.BubbleSorter",IntSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        BubbleSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt));    
    }

}