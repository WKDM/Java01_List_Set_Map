package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {

	public static void main(String[] args) {
		/*
		 * A:�������϶���
		 * B:�����ַ�������
		 * C:���ַ�������ӵ����϶�����ȥ
		 * D:��������
		 * */
		Collection collection = new ArrayList();
		collection.add("���");
		collection.add("��С");
		collection.add("��ƽ");
		collection.add("��˳");
		collection.add("����");
		//����
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			String string=(String) iterator.next();
			System.out.println(string);
		}
	}

}
