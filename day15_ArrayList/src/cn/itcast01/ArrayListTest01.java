package cn.itcast01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {
	/*
	 * 去除Arraylist的重复值：
	 * 分析：
	 * 		A:创建集合对象
	 * 		B:添加多个字符串元素（包含内容相同的）
	 * 		C:创建新集合
	 * 		D:遍历旧集合获取到每一个元素
	 * 		E:拿这个元素到新集合去找，看有没有
	 * 			有：不搭理它
	 * 			没有：就添加到新集合
	 * 		F:遍历新集合
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("javaee");
		array.add("web");
		array.add("java");
		array.add("hello");
		ArrayList newarray = new ArrayList();
		Iterator it1 = array.iterator();
		while(it1.hasNext()){
			String s = (String) it1.next();
			if(!newarray.contains(s)){
				newarray.add(s);
			}
		}
		for(int j=0;j<newarray.size();j++){
			String s1 = (String) newarray.get(j);
			System.out.println(s1);
		}
	}
}
