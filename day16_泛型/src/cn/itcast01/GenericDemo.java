package cn.itcast01;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
/*
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ���������ͣ����������ͣ������͵�������һ���Ĵ��ݡ�
 * ��ʽ��
 * 		<��������>
 * 		�˴�����������ֻ������������
 * �ŵ㣺A:������ʱ�ڵ�������ǰ��������ʱ��
 * 		B:������ǿ������ת��
 * 		C:�Ż��˳�����ƣ�����˻�ɫ������
 * */
	public static void main(String[] args) {
		ArrayList<String> array =new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
//		array.add(new Integer(10));
//		array.add(10);
//		�ȼ���array.add(Integer.valueOf(10));
		
		Iterator<String> it =array.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}

}
