package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的由来：
 * 数组与集合的区别：
 * 	A：长度区别：
 * 		数组长度固定
 * 		集合长度可变
 * 	B:内容区别
 * 		数组存储的是同一种类型的元素
 * 		集合可以存储不同类型的元素
 * 	C:元素的数据类型问题
 * 		数组可以存储基本类型和引用类型（byte、short、int、long、float、double、char、boolean）
 * 		集合只能存储引用类型（数组、类）
 * 
 * 
 * 
 * Collection：是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的
 * 功能：
 * 	1.添加：
 * 		boolean add(Object obj),添加一个元素
 * 		boolean addAll(Collection obj),添加一个集合的功能
 * 	2.删除：
 * 		void clear()移除所有元素 
 * 		boolean remove(object o):移除一个元素
 * 		boolean removeAll(Collection o):移除一个集合元素		
 * 	3.判断：
 * 		boolean contains(Object o)判断是否包含制定的元素
 * 		boolean contains(Collection o)判断是否包含指定的集合元素
 * 		boolean isEmpty():判断集合是否为空
 * 	4.获取：
 * 		Iterator<E> iterator()重点
 * 	5.长度：
 * 		int size():元素的个数
 * 		面试题：数组有length，字符串有length，集合没有length有size
 * 	6.交集：
 * 		retainAll(Collect o):两个集合都有的元素
 * 	7.把集合转为数组
 * 		Object[] toArray()
 * */
public class CellectionDemo {
	public static void main(String[] args) {
		//测试不带All的方法
//		Collection collection = new Collection()是错误的定义方式
		Collection c = new ArrayList();
		System.out.println("c="+c);
		//boolean add(Object obj),添加一个元素
		System.out.println("add:"+c.add("hello"));
		c.add("world");
		c.add("java");
		System.out.println("c="+c);
		
		
		//void clear()移除所有元素 
		//c.clear();
		//boolean clear(object o):移除一个元素
		//System.out.println("remove:"+c.remove("hello"));
		
//		boolean contains(Object o)判断是否包含制定的元素
		//System.out.println("contains:"+c.contains("hello"));
		
		//boolean isEmpty():判断集合是否为空
		System.out.println("isEmpty:"+c.isEmpty());
		
//		int size():元素的个数
		System.out.println("size:"+c.size());
		
		
		
		
		System.out.println("c="+c);
	}
}
