package cn.itcast01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
/*
 * 泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊类型，参数化类型，把类型当作参数一样的传递》
 * 格式：
 * 		<数据类型>
 * 		此处的数据类型只能是引用类型
 * 优点：A:把运行时期的问题提前到了运行时期
 * 		B:避免了强制类型转换
 * 		C:优化了程序设计，解决了黄色警告线
 * */
	public static void main(String[] args) {
		ArrayList<String> array =new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
//		array.add(new Integer(10));
//		array.add(10);
//		等价于array.add(Integer.valueOf(10));
		
		Iterator<String> it =array.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}

}
