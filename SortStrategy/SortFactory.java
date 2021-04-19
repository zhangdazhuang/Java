package SortStrategy;

import java.lang.reflect.Constructor;
import java.lang.Class;
public class SortFactory {
    public SortFactory(){}

    public static SortHandle getSortHandleInterface(String classname){
        SortHandle sortHandle = null;
        try{
            //利用反射实例化对象
            sortHandle = (SortHandle)Class.forName(classname).newInstance();

        }catch(Exception e){
            e.printStackTrace();
        }
        return sortHandle;
    }
    public static Sort getSortInterface(String classname,SortHandle sorthandle){
        Sort sort = null;
        try{
            //利用反射实例化对象
            // sort = (Sort)Class.forName(classname).newInstance();
            Class cls = Class.forName(classname);
            Constructor constructor = cls.getConstructor(SortHandle.class);
            sort = (Sort)constructor.newInstance(sorthandle);
        }catch(Exception e){
            e.printStackTrace();
        }
        return sort;

    }

}