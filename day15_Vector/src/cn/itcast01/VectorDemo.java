package cn.itcast01;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	/*
	 * Vector���й���:
	 * 1.��ӹ��ܣ�add()
	 * addElement(Object obj)����ָ���������ӵ���������ĩβ�������С����1��
	 * 2.��ȡ���ܣ�get()  Iterator it.iterator   --hasNext()    --next()
	 * public Object elementAt(int index)������ָ���������������
	 * public Enumeration elements()
	 * 		hasMoreElements() 
	 * 		nextElement() 
	 * */
	public static void main(String[] args) {
		//��������
		Vector v1 =new Vector();
		//���Ԫ��
		v1.addElement("hello");
		v1.addElement("world");
		v1.addElement("java");
		
		//����
		for(int i=0;i<v1.size();i++){
			String s1 = (String) v1.elementAt(i);
			System.out.println(s1);
		}
		System.out.println("=================");
		Enumeration emnu = v1.elements();
		while(emnu.hasMoreElements()){
			String s2 = (String) emnu.nextElement();
			System.out.println(s2);
		}
	}
}
