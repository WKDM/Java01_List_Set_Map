package cn.itcast02;

import java.util.ArrayList;
import java.util.List;

public class ListDemo03 {

	public static void main(String[] args) {
//		LIst特有的遍历
		List l2 = new ArrayList();
		l2.add("java");
		l2.add("web");
		l2.add("python");
		
		for(int i=0;i<l2.size();i++){
			String s1 = (String) l2.get(i);
			System.out.println(s1);
		}
	}

}
