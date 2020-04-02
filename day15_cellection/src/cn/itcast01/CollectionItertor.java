package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator()迭代器，集合的专用遍历方式
 * Object next()获取元素，并到下一个元素
 * hasNext()判断是否还有下一个元素
 * */
public class CollectionItertor {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		//Iterator是接口所以------
		Iterator it = collection.iterator();//实际返回的肯定是子类对象，这里是多态
//		Object obj = it.next();
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		while(it.hasNext()){
//			System.out.println(it.next());
			String str =(String) it.next();
			System.out.println(str);
		}
	}

}
