package cn.cast01;

import java.util.Scanner;

/*
 * ������ʽ��
 * 
 * */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������qq��:");
		String qq = sc.nextLine();	
		
		System.out.println("qq�ţ�"+ checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
//public static boolean matches(regex){}//��֪���ַ����Ƿ�ƥ��������ʽ
//		String regex = "[1-9][0-9]{4,14}";
//		boolean flag = qq.matches(regex);
//		return flag;
		return qq.matches("[1-9][0-9]{4,14}");
	}
}
