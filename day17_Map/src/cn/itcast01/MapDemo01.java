package cn.itcast01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�ܽ���", "����");
		map.put("������", "��ӱ");
		map.put("������", "����");
		map.put("�˳�", "��ٳ");
		System.out.println("map:"+map);
		
		//void clear()
//		map.clear();
//		System.out.println("clrar:"+map);
		
//		void remove()		
//		map.remove("�ܽ���");
//		System.out.println("remove:"+map);
		
//		boolean containsKey()		
		System.out.println(map.containsKey("�ܽ���"));
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsValue("����"));
		
		//int size()
		System.out.println("map.size"+map.size());
	}
}
