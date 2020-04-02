package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		/*
		 * A:创建集合对象
		 * B:创建字符串对象
		 * C:把字符串对象加到集合对象中去
		 * D:遍历集合
		 * */
		Collection collection = new ArrayList();
		collection.add("五大");
		collection.add("四小");
		collection.add("三平");
		collection.add("六顺");
		collection.add("二马");
		//便利
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			String string=(String) iterator.next();
			System.out.println(string);
		}
	}

}
