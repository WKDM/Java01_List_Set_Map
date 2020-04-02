package cn.itcast06;

import java.util.*;

public class Zongjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("it001", "java");
		hm.put("it002", "javaEE");
		hm.put("it003", "Woeld");
		hm.put("it004", "python");
//		方法一
		Set<String> set = hm.keySet();
		System.out.println("方法一：根据键找值：");
		for(String key:set){
			String value = hm.get(key);
			System.out.println(key+"-"+value);
		}
		System.out.println();
		
//		方法二
		Set<Map.Entry<String,String>> set2 = hm.entrySet();
		System.out.println("方法二：键值对对象找键值：");
		for(Map.Entry<String,String> me:set2){
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"-"+value);
		}
		
		
	}

}
