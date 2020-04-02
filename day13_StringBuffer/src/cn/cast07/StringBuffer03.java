package cn.cast07;

import java.util.Scanner;

/*
 * 判断输入的字符串是否为对称
 * */
public class StringBuffer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		
		//功能实现
//		方法一：
		boolean result = isSame(str);
		System.out.println(result);
//		方法二：
		boolean result2 = isSame2(str);
		System.out.println(result2);
	}
//	方法一：
	public static boolean isSame(String str){
		boolean flag = true;
		char[] ch = str.toCharArray();
		for(int start = 0,end = ch.length-1;start<end;start++,end--){
			if(ch[start]!=ch[end]){
				flag = false;
			}
		}
		return flag;
	}
	
//	方法二：
	public static boolean isSame2(String str){
		return new StringBuffer(str).reverse().toString().equals(str);
	}

}
