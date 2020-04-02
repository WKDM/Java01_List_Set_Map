package cn.itcast01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("杨过","小龙女");
		map.put("郭靖","黄蓉");
		map.put("陈玄风","梅超风");
		map.put("杨康","穆念慈");
//		获取所有键值对对象
//		遍历键值对对象的集合，得到每一个键值对对象
//		根据键值对对象获取键和值
		Set<Map.Entry<String,String>> set = map.entrySet();
		for(Map.Entry<String,String> me:set){
			String keys = me.getKey();
			String values = me.getValue();
			System.out.println(keys+"++++++"+values);
		}
	}

}
