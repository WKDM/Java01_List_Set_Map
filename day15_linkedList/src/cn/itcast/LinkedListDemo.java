package cn.itcast;

import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * 1.��ӹ��ܣ�
	 * public void addFirst(Object e)���ڸ��б�ͷ����ָ����Ԫ�ء�
	 * public void addFirst(Object e)
	 * 2.��ȡ���ܣ�
	 * public Object getFirst()���ش��б��еĵ�һ��Ԫ��
	 * public Object getFirst()
	 * 3.ɾ�����ܣ�
	 * public Object removeFirst()�Ӵ��б���ɾ�������ص�һ��Ԫ��
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
