package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的遍历：就是依次获取集合中的每一个元素
 * 	Object[] toArray()
 * */
public class CollectionDeemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象
		Collection c= new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		//遍历Object[] toArray()
		System.out.println("c:"+c);
		Object[] objects = c.toArray();
		for(int i=0;i<objects.length;i++){
			System.out.println("object:"+objects[i]);
			//如果想要知道每个字符串的长度就要：
			String string = objects[i].toString();
			System.out.println(string+"他的长度为："+string.length());
		}
		
	}

}
