package cn.itcast01;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	/*
	 * Vector特有功能:
	 * 1.添加功能：add()
	 * addElement(Object obj)：将指定的组件添加到此向量的末尾，将其大小增加1。
	 * 2.获取功能：get()  Iterator it.iterator   --hasNext()    --next()
	 * public Object elementAt(int index)：返回指定索引处的组件。
	 * public Enumeration elements()
	 * 		hasMoreElements() 
	 * 		nextElement() 
	 * */
	public static void main(String[] args) {
		//创建对象
		Vector v1 =new Vector();
		//添加元素
		v1.addElement("hello");
		v1.addElement("world");
		v1.addElement("java");
		
		//遍历
		for(int i=0;i<v1.size();i++){
			String s1 = (String) v1.elementAt(i);
			System.out.println(s1);
		}
		System.out.println("=================");
		Enumeration emnu = v1.elements();
		while(emnu.hasMoreElements()){
			String s2 = (String) emnu.nextElement();
			System.out.println(s2);
		}
	}
}
