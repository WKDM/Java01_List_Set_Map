package cn.itcast01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {
	/*
	 * ȥ��Arraylist���ظ�ֵ��
	 * ������
	 * 		A:�������϶���
	 * 		B:��Ӷ���ַ���Ԫ�أ�����������ͬ�ģ�
	 * 		C:�����¼���
	 * 		D:�����ɼ��ϻ�ȡ��ÿһ��Ԫ��
	 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
	 * 			�У���������
	 * 			û�У�����ӵ��¼���
	 * 		F:�����¼���
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������϶���
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("javaee");
		array.add("web");
		array.add("java");
		array.add("hello");
		ArrayList newarray = new ArrayList();
		Iterator it1 = array.iterator();
		while(it1.hasNext()){
			String s = (String) it1.next();
			if(!newarray.contains(s)){
				newarray.add(s);
			}
		}
		for(int j=0;j<newarray.size();j++){
			String s1 = (String) newarray.get(j);
			System.out.println(s1);
		}
	}
}
