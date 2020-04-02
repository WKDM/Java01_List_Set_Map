package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection obj),添加一个集合的功能
 * boolean removeAll(Collection o):移除一个集合元素
 * boolean containsAll(Collection o)判断是否包含指定的集合元素
 * retainAll(Collect o):两个集合都有的元素
 * 
 * */
public class CellectionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		//创建集合2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
//		boolean addAll(Collection obj),添加一个集合的功能
		//System.out.println("c1.addAll(c2):"+c1.addAll(c2));
		
		//boolean removeAll(Collection o):移除一个集合元素
		//只要有一个移除就返回true
		//System.out.println("c1.removeAll(c2):"+c1.removeAll(c2));
		
		//boolean containsAll(Collection o)判断是否包含指定的集合元素
		//只有包含所有的元素才叫包含
		//System.out.println("c1.containsAll(c2)"+c1.containsAll(c2));
		
		
		
		//retainAll(Collect o):两个集合都有的元素
		System.out.println("retainAll()"+c1.retainAll(c2));
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		

		
	}

}
