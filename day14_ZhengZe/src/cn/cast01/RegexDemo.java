package cn.cast01;

import java.util.Scanner;

/*
 * 正则表达式：
 * 
 * */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您的qq号:");
		String qq = sc.nextLine();	
		
		System.out.println("qq号："+ checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
//public static boolean matches(regex){}//告知此字符串是否匹配正则表达式
//		String regex = "[1-9][0-9]{4,14}";
//		boolean flag = qq.matches(regex);
//		return flag;
		return qq.matches("[1-9][0-9]{4,14}");
	}
}
