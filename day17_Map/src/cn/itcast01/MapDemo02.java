package cn.itcast01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("周杰伦", "昆凌");
		map.put("黄晓明", "杨颖");
		map.put("刘恺威", "杨幂");
		map.put("邓超", "孙俪");
		//V get(Object obj):根据键获取值
		System.out.println(map.get("周杰伦"));
		System.out.println(map.get("周杰"));
		System.out.println("++++++++++++");
		//Set<K> keySet()获取集合中所有键的集合
		Set<String> set=map.keySet();
		for(String key:set){
			System.out.println(key);
		}
		System.out.println("++++++++++++");
		//Collection<V> value()获取集合中所有值的集合
		Collection<String> con=map.values();
		for(String values:con){
			System.out.println(values);
		}
	}

}
