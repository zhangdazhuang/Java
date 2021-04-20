package SortStrategy;

import SortStrategy.SortInterface.SortHandle;
import SortStrategy.SortInterface.Sort;

import org.junit.Test;
import java.util.Arrays;

public class SortMain {

    int[] arrayInt = {59,8,7,16,5,1,0,34,6,223,56,33,24,4};//
    double[] arrayDou = {0.9,8.3,0.7,6.5,5.1,5.4,9.3,2.6,1.0,0.6,3.4,1.56,2.23,9.56};

    
    @Test //冒泡 int
    public void BubbleSorterInt(){
        //反射获得SortHandle接口的实现类IntSortHandle的对象
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort bubbleSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.BubbleSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        bubbleSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt));    
    }
    @Test //冒泡 double
    public void BubbleSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort bubbleSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.BubbleSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        bubbleSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou));    
    }

    @Test   //选择 int
    public void SelectSorterInt(){
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort selectSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.SelectSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        selectSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt));   
    }
    @Test   //选择 double
    public void SelectSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort selectSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.SelectSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        selectSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou));   
    }
    @Test   //插入 int 
    public void InsertSorterInt(){
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort insertSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.InsertSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        insertSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt)); 
    }
    @Test   //插入 double
    public void InsertSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort insertSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.InsertSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        insertSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou));   
    }
    @Test   //希尔 int 
    public void ShellSorterInt(){
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort ShellSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.ShellSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        ShellSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt)); 
    }
    @Test   //希尔 dou 
    public void ShellSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort ShellSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.ShellSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        ShellSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou)); 
    }
    @Test   //快速 int 
    public void QuickSorterInt(){
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort quickSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.QuickSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        quickSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt)); 
    }
    @Test   //快速 dou 
    public void QuickSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort quickSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.QuickSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        quickSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou)); 
    }
    @Test   //归并 int 
    public void MergeSorterInt(){
        SortHandle intSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.IntSortHandle");
        Sort mergeSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.MergeSorter",intSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayInt));  
        mergeSorter.sort(arrayInt);
        System.out.println("排序后:" +Arrays.toString(arrayInt)); 
    }

    @Test   //归并 dou 
    public void MergeSorterDou(){
        SortHandle doubleSortHandle= SortFactory.getSortHandleInterface("SortStrategy.SortImplements.DoubleSortHandle");
        Sort mergeSorter = SortFactory.getSortInterface("SortStrategy.SortImplements.MergeSorter",doubleSortHandle);   
        System.out.println("排序前:" + Arrays.toString(arrayDou));  
        mergeSorter.sort(arrayDou);
        System.out.println("排序后:" +Arrays.toString(arrayDou)); 
    }
}