package cn.itcast01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("杨过","小龙女");
		map.put("郭靖","黄蓉");
		map.put("陈玄风","梅超风");
		map.put("杨康","穆念慈");
//		Map集合的遍历
//		1.获取所有的键
//		2.遍历键的集合，获取所有的键
//		3.根据建获取对应的值
		Set<String> set =map.keySet();
		for(String key:set){
			String values = map.get(key);
			System.out.println(key+"===="+values);
		}
	}

}
