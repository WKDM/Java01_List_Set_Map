package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator()�����������ϵ�ר�ñ�����ʽ
 * Object next()��ȡԪ�أ�������һ��Ԫ��
 * hasNext()�ж��Ƿ�����һ��Ԫ��
 * */
public class CollectionItertor {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		//Iterator�ǽӿ�����------
		Iterator it = collection.iterator();//ʵ�ʷ��صĿ϶���������������Ƕ�̬
//		Object obj = it.next();
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
//		if(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		while(it.hasNext()){
//			System.out.println(it.next());
			String str =(String) it.next();
			System.out.println(str);
		}
	}

}
