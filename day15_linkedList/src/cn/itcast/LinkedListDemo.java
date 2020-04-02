package cn.itcast;

import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * 1.添加功能：
	 * public void addFirst(Object e)：在该列表开头插入指定的元素。
	 * public void addFirst(Object e)
	 * 2.获取功能：
	 * public Object getFirst()返回此列表中的第一个元素
	 * public Object getFirst()
	 * 3.删除功能：
	 * public Object removeFirst()从此列表中删除并返回第一个元素
	 * public Object removeLast()
	 * */
	public static void main(String[] args) {
		 LinkedList ll =new LinkedList();
		 ll.addFirst("hello");
		 ll.addFirst("java");
		 ll.addFirst("world");
		 
		 System.out.println(ll.getFirst());
		 System.out.println(ll.getLast());
		 
		 System.out.println(ll.removeLast());
	}

}
