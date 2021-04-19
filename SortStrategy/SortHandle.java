package SortStrategy;
// 接口，定义排序所需的四种方法
public interface SortHandle
{
  public void swap(int index);
  public boolean outOfOrder(int index);
  public int length();
  public void setArray(Object array);
}