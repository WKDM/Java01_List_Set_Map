package cn.itcast01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�ܽ���", "����");
		map.put("������", "��ӱ");
		map.put("������", "����");
		map.put("�˳�", "��ٳ");
		System.out.println("map:"+map);
	}
}
