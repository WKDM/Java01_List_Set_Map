package cn.iscast01;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.添加：void add(int index,Object element)
 * 2.获取：Object get(int index)获取指定位置的元素
 * 3.删除：object remove(int index)移除指定位置的元素，返回移除的对象
 * 4.列表迭代器：ListIterator listiterator()List特有的迭代器集合
 * 5.修改：Object set(int index,Object element)修改指定位置的元素,返回修改的元素
 * */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 =new ArrayList();
		l1.add("hello");
		l1.add("java");
		l1.add("love");
//		l1.add(1,"you");
//		System.out.println("l1"+l1);
//		System.out.println("l1.get(1);"+l1.get(1));
//		System.out.println("li.remove():"+l1.remove(2));
		System.out.println("l1.set():"+l1.set(2, "javeEE"));
		System.out.println("l1"+l1);
	}

}
