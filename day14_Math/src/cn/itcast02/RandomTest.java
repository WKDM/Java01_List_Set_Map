package cn.itcast02;

import java.util.Scanner;

public class RandomTest {
	/*
	 * 随机获取一个范围内的随机数
	 * 键入start、end值
	 * 想办法获取其中间的值
	 * 输出
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数：");
		int start = sc.nextInt();
		System.out.println("请输入结束数：");
		int end = sc.nextInt();
		for(int i=1;i<=100;i++){
			int num = getRandom(start, end);
			System.out.println(num);
		}
	}
	public static int getRandom(int start,int end){
		int number = (int)(Math.random()*(end-start+1))+start;		
		return number;
	}

}
