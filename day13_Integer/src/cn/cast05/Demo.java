package cn.cast05;

import java.util.Scanner;

public class Demo {

	private static final boolean isDigit = false;

	public static void main(String[] args) {
		int BigCount=0;
		int SmallCount=0;
		int NumberCount=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.nextLine();
		//把字符串转化为数组
		char[] ch = str.toCharArray();	
		for(int i=0;i<ch.length-1;i++){
			if(Character.isUpperCase(ch[i])){
				BigCount++;
			}else if(Character.isLowerCase(ch[i])){
				SmallCount++;
			}else if(Character.isDigit(ch[i])){
				NumberCount++;
			}
		}
		System.out.println("大写字符母个数为："+BigCount+"\n小写字母个数为："+SmallCount+"\n数字个数："+NumberCount);
	}
}
