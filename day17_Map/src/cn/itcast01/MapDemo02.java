package cn.itcast01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("�ܽ���", "����");
		map.put("������", "��ӱ");
		map.put("������", "����");
		map.put("�˳�", "��ٳ");
		//V get(Object obj):���ݼ���ȡֵ
		System.out.println(map.get("�ܽ���"));
		System.out.println(map.get("�ܽ�"));
		System.out.println("++++++++++++");
		//Set<K> keySet()��ȡ���������м��ļ���
		Set<String> set=map.keySet();
		for(String key:set){
			System.out.println(key);
		}
		System.out.println("++++++++++++");
		//Collection<V> value()��ȡ����������ֵ�ļ���
		Collection<String> con=map.values();
		for(String values:con){
			System.out.println(values);
		}
	}

}
