package cn.cast05;

import java.io.ObjectInputStream.GetField;

/*
 * String ��ת������
 * byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
 * char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 * static String valueOf(char[] chs):���ַ�����ת�����ַ���
 * static String valueOf(int i):��int���͵�����ת�����ַ���
 * 		ע�⣺String���valueOf�������԰��������͵�����ת�����ַ���
 * String toLowerCase():���ַ����ĳ�Сд
 * String toUpperCase():���ַ����ĳɴ�д
 * String concat(String str):���ַ���ƴ��
 * */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "JavaSE";
//		byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
		byte[] bys = s1.getBytes();
		for(int i=0;i<s1.length();i++){
			System.out.println(bys[i]);
		}
		System.out.println("====================");
		
		
//		char[] toCharArray():���ַ���ת��Ϊ�ַ�����
		char[] ch = s1.toCharArray();
		for(int i=0;i<s1.length();i++){
			System.out.println(ch[i]);
		}
		System.out.println("====================");
		

		//		static String valueOf(char[] chs):���ַ�����ת�����ַ���
		String str01 = String.valueOf(ch);
		System.out.println(str01);
		System.out.println("====================");
		//		static String valueOf(int i):��int���͵�����ת�����ַ���
		int i = 100;
		System.out.println(i);
		System.out.println("====================");
		//		 		ע�⣺String���valueOf�������԰��������͵�����ת�����ַ���
		
		//		String toLowerCase():���ַ����ĳ�Сд
		System.out.println(s1.toLowerCase());
		//		String toUpperCase():���ַ����ĳɴ�д
		System.out.println(s1.toUpperCase());
		//		String concat(String str):���ַ���ƴ��
		String s2 = "�ҵ��";
		System.out.println(s1.concat(s2));
	}

}
