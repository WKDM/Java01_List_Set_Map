package cn.itcast03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
/*
 * ListIterator listiterator   list特有的迭代器功能
 * */
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
//		ListIterator listIterator = list.listIterator();
//		while(listIterator.hasNext()){
//			String s1 = (String) listIterator.next();
//			System.out.println(s1);
		
		
		
//		方式一：迭代器迭代元素，迭代器修改元素
//		而iterator迭代器却没有添加功能，所以我们使用其子接口listIterator
		ListIterator l2 = list.listIterator();
		while(l2.hasNext()){
			String s1 = (String) l2.next();
			if("world".equals(s1)){
				list.add("javaee");
			}		
		}
		System.out.println("list:"+list);
	}

}
