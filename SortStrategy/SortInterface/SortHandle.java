package SortStrategy.SortInterface;

// 接口，定义排序所需的四种方法
public interface SortHandle
{
  public void swap(int index);
  public boolean outOfOrder(int index);
  public int length();
  public void setArray(Object array);

  public void swapTwo(int index1,int index2);
  public boolean outOfOrderTwo(int index,int index2);
  public void sortSpecificMethod();
  
}