package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵ�������
 * �����뼯�ϵ�����
 * 	A����������
 * 		���鳤�ȹ̶�
 * 		���ϳ��ȿɱ�
 * 	B:��������
 * 		����洢����ͬһ�����͵�Ԫ��
 * 		���Ͽ��Դ洢��ͬ���͵�Ԫ��
 * 	C:Ԫ�ص�������������
 * 		������Դ洢�������ͺ��������ͣ�byte��short��int��long��float��double��char��boolean��
 * 		����ֻ�ܴ洢�������ͣ����顢�ࣩ
 * 
 * 
 * 
 * Collection���Ǽ��ϵĶ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ��������
 * ���ܣ�
 * 	1.��ӣ�
 * 		boolean add(Object obj),���һ��Ԫ��
 * 		boolean addAll(Collection obj),���һ�����ϵĹ���
 * 	2.ɾ����
 * 		void clear()�Ƴ�����Ԫ�� 
 * 		boolean remove(object o):�Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection o):�Ƴ�һ������Ԫ��		
 * 	3.�жϣ�
 * 		boolean contains(Object o)�ж��Ƿ�����ƶ���Ԫ��
 * 		boolean contains(Collection o)�ж��Ƿ����ָ���ļ���Ԫ��
 * 		boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * 	4.��ȡ��
 * 		Iterator<E> iterator()�ص�
 * 	5.���ȣ�
 * 		int size():Ԫ�صĸ���
 * 		�����⣺������length���ַ�����length������û��length��size
 * 	6.������
 * 		retainAll(Collect o):�������϶��е�Ԫ��
 * 	7.�Ѽ���תΪ����
 * 		Object[] toArray()
 * */
public class CellectionDemo {
	public static void main(String[] args) {
		//���Բ���All�ķ���
//		Collection collection = new Collection()�Ǵ���Ķ��巽ʽ
		Collection c = new ArrayList();
		System.out.println("c="+c);
		//boolean add(Object obj),���һ��Ԫ��
		System.out.println("add:"+c.add("hello"));
		c.add("world");
		c.add("java");
		System.out.println("c="+c);
		
		
		//void clear()�Ƴ�����Ԫ�� 
		//c.clear();
		//boolean clear(object o):�Ƴ�һ��Ԫ��
		//System.out.println("remove:"+c.remove("hello"));
		
//		boolean contains(Object o)�ж��Ƿ�����ƶ���Ԫ��
		//System.out.println("contains:"+c.contains("hello"));
		
		//boolean isEmpty():�жϼ����Ƿ�Ϊ��
		System.out.println("isEmpty:"+c.isEmpty());
		
//		int size():Ԫ�صĸ���
		System.out.println("size:"+c.size());
		
		
		
		
		System.out.println("c="+c);
	}
}
