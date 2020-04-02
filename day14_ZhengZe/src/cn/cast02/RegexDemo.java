package cn.cast02;

import java.util.Scanner;

/*
 * 判断功能
 * public boolean matches(String regex)
 * 判断手机号码是否满足要求：
 * 	A键入一个手机号码
 * 	B定义手机号码的规则
 * 	C调用手机guize，判断即可
 * 	D输出即可
 * */
public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入手机号：");
		String phone = sc.nextLine();
		
		String regex = "[1][38]\\d{9}";
		//调用判断功能
		boolean result = phone.matches(regex);
		System.out.println(result);
	}
}
