package cn.itcast01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("���","С��Ů");
		map.put("����","����");
		map.put("������","÷����");
		map.put("�","�����");
//		��ȡ���м�ֵ�Զ���
//		������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
//		���ݼ�ֵ�Զ����ȡ����ֵ
		Set<Map.Entry<String,String>> set = map.entrySet();
		for(Map.Entry<String,String> me:set){
			String keys = me.getKey();
			String values = me.getValue();
			System.out.println(keys+"++++++"+values);
		}
	}

}
