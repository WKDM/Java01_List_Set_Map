package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵı������������λ�ȡ�����е�ÿһ��Ԫ��
 * 	Object[] toArray()
 * */
public class CollectionDeemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������϶���
		Collection c= new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		//����Object[] toArray()
		System.out.println("c:"+c);
		Object[] objects = c.toArray();
		for(int i=0;i<objects.length;i++){
			System.out.println("object:"+objects[i]);
			//�����Ҫ֪��ÿ���ַ����ĳ��Ⱦ�Ҫ��
			String string = objects[i].toString();
			System.out.println(string+"���ĳ���Ϊ��"+string.length());
		}
		
	}

}
