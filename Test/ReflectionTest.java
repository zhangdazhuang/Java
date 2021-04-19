package Test;

/**
 * 获取Class对象的三种方式
 * 1 Object ——> getClass();
 * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
 * 3 通过Class类的静态方法：forName（String  className）(常用)
 *
 */
public class ReflectionTest{
	public static void main(String[] args) {
		//第一种方式获取Class对象  
		// Student stu1 = new Student();//这一new 产生一个Student对象，一个Class对象。
		// Class stuClass = stu1.getClass();//获取Class对象
		
		// System.out.println(stuClass.getName());
		
		//第二种方式获取Class对象
		Class stuClass2 = Student.class;
		// System.out.println(stuClass == stuClass2);
		System.out.println(stuClass2);
//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个
		
// 		//第三种方式获取Class对象
		try {
			Class stuClass3 = Class.forName("Test.Student");
//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
			System.out.println(stuClass3 == stuClass2);
//判断三种方式是否获取的是同一个Class对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
 
// 		System.out.println("*****************获取公有、无参的构造方法*************");
		Constructor con = clazz.getConstructor(null);
// 		//1>、因为是无参的构造方法所以类型是一个null,不写也可以：这里需要的是一个参数的类型，切记是类型
// 		//2>、返回的是描述这个无参构造函数的类对象。
 
 
// 		System.out.println("*************获取公有字段**并调用*****************");
// 		Field f = stuClass.getField("name");
//         System.out.println(f);
		
 
// 		System.out.println("***************获取私有的show4()方法******************");
// 		m = stuClass.getDeclaredMethod("show4", int.class);
// 		System.out.println(m);
// 		m.setAccessible(true);//解除私有限定
// 		Object result = m.invoke(obj, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
// 		System.out.println("返回值：" + result);
 
	}
}