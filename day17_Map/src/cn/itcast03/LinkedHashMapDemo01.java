package cn.itcast03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinedHashMap:是map哈希表（唯一性）的链接（有序性）列表的实现，具有可预知的迭代顺序
 * */
public class LinkedHashMapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("2345", "java");
		lhm.put("1234", "javaweb");
		lhm.put("3456", "python");
		lhm.put("4567", "android");
		//遍历
		Set<String> set =lhm.keySet();
		for(String key:set){
			String value = lhm.get(key);
			System.out.println(key+"---"+value);
		}
	}

}
