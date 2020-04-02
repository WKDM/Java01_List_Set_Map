package cn.itcast02;

import java.util.HashMap;
import java.util.Set;
/*
 * hashMap是基于哈希表的map结构；
 * 		哈希表是保证map集合的唯一性
 * */
public class HashMapDemo01 {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("it001", "马云");
		hm.put("it002", "马化腾");
		hm.put("it003", "雷军");
		hm.put("it004", "邱伯均");
		hm.put("it005", "乔布斯");
		hm.put("it001", "乔治");
		//遍历
		Set<String> set = hm.keySet();
		for(String key:set){
			String value = hm.get(key);
			System.out.println(key+"======"+value);
		}
	}
}
