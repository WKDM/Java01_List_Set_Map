package cn.cast03;

import java.util.Scanner;

/*
 * 分割功能
 * public String[] split(String regex)
 * */
public class RegexDemo {
	public static void main(String[] args) {
		String string = "18-24";
		String regex = "-";
		String[] strArray = string.split(regex);
//		for(int i=0;i<strArray.length;i++){
//			System.out.println(strArray[i]);
//		}
		//得到int 类型的
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你想要的年龄：");
		int needAge = sc.nextInt();
		if(needAge >=startAge && needAge<=endAge){
			System.out.println("正式你想要的");
		}else{
			System.out.println("不是你想要的，gun");
		}
	}
}
