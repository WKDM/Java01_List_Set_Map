package cn.itcast01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("���","С��Ů");
		map.put("����","����");
		map.put("������","÷����");
		map.put("�","�����");
//		Map���ϵı���
//		1.��ȡ���еļ�
//		2.�������ļ��ϣ���ȡ���еļ�
//		3.���ݽ���ȡ��Ӧ��ֵ
		Set<String> set =map.keySet();
		for(String key:set){
			String values = map.get(key);
			System.out.println(key+"===="+values);
		}
	}

}
