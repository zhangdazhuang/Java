package SortStrategy;

import SortStrategy.SortInterface.SortHandle;
import SortStrategy.SortInterface.Sort;

import org.junit.Test;
import java.util.Arrays;

public class SortMain {

    int[] arrayInt = {9,8,7,6,5,4,3,2,1,0,34,56,223,56};
    double[] arrayDou = {0.9,8.3,0.7,6.5,5.1,5.4,9.3,2.6,1.0,0.6,3.4,1.56,2.23,9.56};
   
    @Test
    public void BubbleSorterInt(){
        //反射获得SortHandle接口的实现类IntSortHandle的对象
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort bubbleSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.BubbleSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        bubbleSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt));    
    }
    @Test
    public void BubbleSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort bubbleSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.BubbleSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        bubbleSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou));    
    }

}