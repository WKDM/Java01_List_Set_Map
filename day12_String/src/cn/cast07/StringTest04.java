package cn.cast07;

import java.util.Scanner;

public class StringTest04 {
	/*
	 * ����¼��һ���ַ�����abc
	 * ���cba
	 * 
	 * ������
	 * 	A����������һ���ַ���
	 * 	B������һ�����ַ���
	 * 	C�����ű������飬���ÿһ���ַ�
	 * 		a:length()��charAt()���
	 * 		b:���ַ����������toCharArray()
	 * 	D�������ַ�����ÿһ���ַ�����ƴ��
	 * 	E��������ַ���
	 * 
	 * 
	 * ����ʵ�֣�
	 * ����ֵ���ͣ�String
	 * �����б�String
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String line = sc.nextLine();
		String string = myReverse(line);
		System.out.println("��ת��Ľ���ǣ�"+string);
	}
	public static String myReverse(String line){
		String str = "";
		char[] ch = line.toCharArray();		
		for(int i=(ch.length-1);i>=0;i--){
			str += ch[i];
		}
		return str;
	}
}
