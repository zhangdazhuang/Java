package Test;

public class Test {
    public static void main(String[] args) {
        String name = "reflectionTest";
        Class c1 = name.getClass();
        System.out.println(c1.getName());

    }    

}
// enum Color
// {
//     RED, GREEN, BLUE,BA;
 
//     // 构造函数
//     private Color()
//     {
//         System.out.println("Constructor called for : " + this.toString());
//     }
 
//     public void colorInfo()
//     {
//         System.out.println("Universal Color");
//     }
// }
 
// public class Test
// {    
//     // 输出
//     public static void main(String[] args)
//     {
//         Color c1 = Color.BA;
//         // System.out.println(c1);
//         c1.colorInfo();
//     }
// }