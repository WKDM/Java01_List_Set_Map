package cn.cast02;

import java.util.Scanner;

/*
 * �жϹ���
 * public boolean matches(String regex)
 * �ж��ֻ������Ƿ�����Ҫ��
 * 	A����һ���ֻ�����
 * 	B�����ֻ�����Ĺ���
 * 	C�����ֻ�guize���жϼ���
 * 	D�������
 * */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ֻ��ţ�");
		String phone = sc.nextLine();
		
		String regex = "[1][38]\\d{9}";
		//�����жϹ���
		boolean result = phone.matches(regex);
		System.out.println(result);
	}
}
