package cn.cast07;

import java.util.Scanner;

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
 * */
public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String line = sc.nextLine();
		
		String str = "";
		
		char[] ch = line.toCharArray();
		
		for(int i=(ch.length-1);i>=0;i--){
			str += ch[i];
		}
		System.err.println("��ת��Ľ���ǣ�"+str);
	}
	
}
