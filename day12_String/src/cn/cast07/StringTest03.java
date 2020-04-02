package cn.cast07;

import java.util.Scanner;

/*
 * 键盘录入一个字符串：abc
 * 输出cba
 * 
 * 分析：
 * 	A：键盘输入一个字符串
 * 	B：定义一个新字符串
 * 	C：倒着遍历数组，输出每一个字符
 * 		a:length()和charAt()结合
 * 		b:把字符串变成数组toCharArray()
 * 	D：用新字符串把每一个字符进行拼接
 * 	E：输出心字符串
 * */
public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String line = sc.nextLine();
		
		String str = "";
		
		char[] ch = line.toCharArray();
		
		for(int i=(ch.length-1);i>=0;i--){
			str += ch[i];
		}
		System.err.println("翻转后的结果是："+str);
	}
	
}
