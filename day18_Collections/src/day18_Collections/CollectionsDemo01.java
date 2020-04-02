package day18_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class CollectionsDemo01 {
/*
 * public static <T> void sort(List<T> list):排序：默认情况下试试自然排序
 * public static <T> int binarySearch(List<T> list,T key):二分查找
 * public static <T> T max(Colletion<?> coll):最大值
 * public static reverse(List<?> list):反转
 * public static void shuffle<List<?> list>:随机置换
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(36);
////		public static <T> void sort(List<T> list):排序：默认情况下试试自然排序
		System.out.println("list排序前："+list);
//		Collections.sort(list);
//		System.out.println("list排序后："+list);
//		
////		public static <T> int binarySearch(List<T> list,T key):二分查找
//		System.out.println("binarySearch查找："+Collections.binarySearch(list, 30));
//		System.out.println("binarySearch查找："+Collections.binarySearch(list, 300));
		
////		 public static <T> T max(Colletion<?> coll):最大值
//		System.out.println("list中的最大值："+Collections.max(list));
		
//		
////		 public static reverse(List<?> list):反转
//		Collections.reverse(list);
//		System.out.println("list反转后："+list);
		
		
//		public static void shuffle<List<?> list>:随机置换
		Collections.shuffle(list);
		System.out.println(list);
	}

}
