package cn.itcast02;

import java.util.HashMap;
import java.util.Set;
/*
 * hashMap�ǻ��ڹ�ϣ���map�ṹ��
 * 		��ϣ���Ǳ�֤map���ϵ�Ψһ��
 * */
public class HashMapDemo01 {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("it001", "����");
		hm.put("it002", "����");
		hm.put("it003", "�׾�");
		hm.put("it004", "�񲮾�");
		hm.put("it005", "�ǲ�˹");
		hm.put("it001", "����");
		//����
		Set<String> set = hm.keySet();
		for(String key:set){
			String value = hm.get(key);
			System.out.println(key+"======"+value);
		}
	}
}
