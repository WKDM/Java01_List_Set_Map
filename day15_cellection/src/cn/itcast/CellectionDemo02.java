package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection obj),���һ�����ϵĹ���
 * boolean removeAll(Collection o):�Ƴ�һ������Ԫ��
 * boolean containsAll(Collection o)�ж��Ƿ����ָ���ļ���Ԫ��
 * retainAll(Collect o):�������϶��е�Ԫ��
 * 
 * */
public class CellectionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		//��������2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
//		boolean addAll(Collection obj),���һ�����ϵĹ���
		//System.out.println("c1.addAll(c2):"+c1.addAll(c2));
		
		//boolean removeAll(Collection o):�Ƴ�һ������Ԫ��
		//ֻҪ��һ���Ƴ��ͷ���true
		//System.out.println("c1.removeAll(c2):"+c1.removeAll(c2));
		
		//boolean containsAll(Collection o)�ж��Ƿ����ָ���ļ���Ԫ��
		//ֻ�а������е�Ԫ�زŽа���
		//System.out.println("c1.containsAll(c2)"+c1.containsAll(c2));
		
		
		
		//retainAll(Collect o):�������϶��е�Ԫ��
		System.out.println("retainAll()"+c1.retainAll(c2));
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		

		
	}

}
