package cn.iscast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("李老大");
		list.add("网老二");
		list.add("李老三");
		
		Iterator iterator =list.iterator();
		while(iterator.hasNext()){
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
