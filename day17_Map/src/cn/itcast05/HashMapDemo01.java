package cn.itcast05;

import java.util.HashMap;
import java.util.Set;

/*
 * 培训班：
 * jc	基础班：
 * 			小红：21
 * 			小花：22
 * gx	高新班：
 * 			黑猫：23
 * 			白猫：24
 * 先存储元素，再遍历元素
 * */
public class HashMapDemo01 {

	public static void main(String[] args) {
		//创建集合元素
		HashMap<String, HashMap<String,Integer>> hm = new HashMap<String, HashMap<String,Integer>>();
		HashMap<String,Integer> jcMap = new HashMap<String,Integer>();
		jcMap.put("小红",23);
		jcMap.put("小花",25);
		HashMap<String, Integer> gxMap = new HashMap<String, Integer>();
		gxMap.put("黑猫",21);
		gxMap.put("白猫", 22);
		hm.put("基础班",jcMap);
		hm.put("高新班",gxMap);
		//便利
		Set<String> hmSet = hm.keySet();
		for(String hmKey:hmSet){
			System.out.println(hmKey);
			HashMap<String,Integer> hmValue = hm.get(hmKey);
			Set<String> hmValueSet = hmValue.keySet();
			for(String hmValueKey:hmValueSet){
				Integer hmValues = hmValue.get(hmValueKey);
				System.out.println(hmValueKey+"-----"+hmValues);
			}
		}
	}

}
