package cn.iscast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("���ϴ�");
		list.add("���϶�");
		list.add("������");
		
		Iterator iterator =list.iterator();
		while(iterator.hasNext()){
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
