package cn.itcast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Adler32;

public class ArrayListDemo01 {
	/*
	 * ArrayList:�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
	 * 			�̲߳���ȫ��Ч�ʸߡ�
	 * Vector���ײ����ݽṹ�����飬��ѯ�죬��ɾ��
	 * 			�̰߳�ȫ��Ч�ʵ�
	 * LinkedList:�ײ����ݽṹ��������ѯ������ɾ��
	 * 			�̲߳���ȫ��Ч�ʸ�
	 * */
	public static void main(String[] args) {
		/*
		 * �洢�ַ���������*/
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
