package cn.itcast04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:是基于红黑树的Map接口的实现
 * */
public class TreeMapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("Hello", "您好");
		tm.put("world", "世界");
		tm.put("java", "爪洼");
		tm.put("Hello", "您好2");
		tm.put("JavaEE", "爪洼EE");
		
		//遍历集合
		Set<String> set=tm.keySet();
		for(String key:set){
			String value=tm.get(key);
			System.out.println(key+"----"+value);
		}
	}

}
