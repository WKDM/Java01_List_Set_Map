package day18_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class CollectionsDemo01 {
/*
 * public static <T> void sort(List<T> list):����Ĭ�������������Ȼ����
 * public static <T> int binarySearch(List<T> list,T key):���ֲ���
 * public static <T> T max(Colletion<?> coll):���ֵ
 * public static reverse(List<?> list):��ת
 * public static void shuffle<List<?> list>:����û�
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(36);
////		public static <T> void sort(List<T> list):����Ĭ�������������Ȼ����
		System.out.println("list����ǰ��"+list);
//		Collections.sort(list);
//		System.out.println("list�����"+list);
//		
////		public static <T> int binarySearch(List<T> list,T key):���ֲ���
//		System.out.println("binarySearch���ң�"+Collections.binarySearch(list, 30));
//		System.out.println("binarySearch���ң�"+Collections.binarySearch(list, 300));
		
////		 public static <T> T max(Colletion<?> coll):���ֵ
//		System.out.println("list�е����ֵ��"+Collections.max(list));
		
//		
////		 public static reverse(List<?> list):��ת
//		Collections.reverse(list);
//		System.out.println("list��ת��"+list);
		
		
//		public static void shuffle<List<?> list>:����û�
		Collections.shuffle(list);
		System.out.println(list);
	}

}
