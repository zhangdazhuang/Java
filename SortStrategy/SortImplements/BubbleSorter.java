package SortStrategy.SortImplements;

import SortStrategy.SortInterface.Sort;
import SortStrategy.SortInterface.SortHandle;

public class BubbleSorter implements Sort
{
  private int length = 0;
  private SortHandle itsSortHandle = null;

  public BubbleSorter(SortHandle handle)
  {
    itsSortHandle = handle;
  }
  
  @Override
  public void sort(Object array)
  {
    System.out.println("冒泡");
    itsSortHandle.setArray(array);
    length = itsSortHandle.length();
    for (int nextToLast = length-2; nextToLast >= 0; nextToLast--)
      for (int index = 0; index <= nextToLast; index++)
      {
        if (itsSortHandle.outOfOrder(index))
          itsSortHandle.swap(index);
      }
  }
}