package cn.itcast03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinedHashMap:��map��ϣ��Ψһ�ԣ������ӣ������ԣ��б��ʵ�֣����п�Ԥ֪�ĵ���˳��
 * */
public class LinkedHashMapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("2345", "java");
		lhm.put("1234", "javaweb");
		lhm.put("3456", "python");
		lhm.put("4567", "android");
		//����
		Set<String> set =lhm.keySet();
		for(String key:set){
			String value = lhm.get(key);
			System.out.println(key+"---"+value);
		}
	}

}
