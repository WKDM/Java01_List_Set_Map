package cn.itcast04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:�ǻ��ں������Map�ӿڵ�ʵ��
 * */
public class TreeMapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("Hello", "����");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("Hello", "����2");
		tm.put("JavaEE", "צ��EE");
		
		//��������
		Set<String> set=tm.keySet();
		for(String key:set){
			String value=tm.get(key);
			System.out.println(key+"----"+value);
		}
	}

}
