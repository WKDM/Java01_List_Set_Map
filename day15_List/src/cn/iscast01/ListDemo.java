package cn.iscast01;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.��ӣ�void add(int index,Object element)
 * 2.��ȡ��Object get(int index)��ȡָ��λ�õ�Ԫ��
 * 3.ɾ����object remove(int index)�Ƴ�ָ��λ�õ�Ԫ�أ������Ƴ��Ķ���
 * 4.�б��������ListIterator listiterator()List���еĵ���������
 * 5.�޸ģ�Object set(int index,Object element)�޸�ָ��λ�õ�Ԫ��,�����޸ĵ�Ԫ��
 * */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 =new ArrayList();
		l1.add("hello");
		l1.add("java");
		l1.add("love");
//		l1.add(1,"you");
//		System.out.println("l1"+l1);
//		System.out.println("l1.get(1);"+l1.get(1));
//		System.out.println("li.remove():"+l1.remove(2));
		System.out.println("l1.set():"+l1.set(2, "javeEE"));
		System.out.println("l1"+l1);
	}

}
