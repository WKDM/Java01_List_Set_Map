package cn.itcast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Adler32;

public class ArrayListDemo01 {
	/*
	 * ArrayList:底层数据结构是数组，查询快，增删慢
	 * 			线程不安全，效率高。
	 * Vector：底层数据结构是数组，查询快，增删慢
	 * 			线程安全，效率低
	 * LinkedList:底层数据结构是链表，查询慢，增删快
	 * 			线程不安全，效率高
	 * */
	public static void main(String[] args) {
		/*
		 * 存储字符串并遍历*/
		ArrayList al1 = new ArrayList();
		al1.add("hello");
		al1.add("java");
		al1.add("world");
		Iterator iterator = al1.iterator();
		while(iterator.hasNext()){
			String s1 = (String) iterator.next();
			System.out.println(s1);
		}
		System.out.println("---------------------");
		for(int i=0;i<al1.size();i++){
			String s1 = (String) al1.get(i);
			System.out.println(s1);
		}
	}
}
