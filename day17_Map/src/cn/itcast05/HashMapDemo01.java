package cn.itcast05;

import java.util.HashMap;
import java.util.Set;

/*
 * ��ѵ�ࣺ
 * jc	�����ࣺ
 * 			С�죺21
 * 			С����22
 * gx	���°ࣺ
 * 			��è��23
 * 			��è��24
 * �ȴ洢Ԫ�أ��ٱ���Ԫ��
 * */
public class HashMapDemo01 {

	public static void main(String[] args) {
		//��������Ԫ��
		HashMap<String, HashMap<String,Integer>> hm = new HashMap<String, HashMap<String,Integer>>();
		HashMap<String,Integer> jcMap = new HashMap<String,Integer>();
		jcMap.put("С��",23);
		jcMap.put("С��",25);
		HashMap<String, Integer> gxMap = new HashMap<String, Integer>();
		gxMap.put("��è",21);
		gxMap.put("��è", 22);
		hm.put("������",jcMap);
		hm.put("���°�",gxMap);
		//����
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
