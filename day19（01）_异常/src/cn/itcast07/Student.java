package cn.itcast07;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("请输入您的分数：");
			Scanner sc = new Scanner(System.in);
			int score = sc.nextInt();
			Teacher th = new Teacher();
			try {
				th.check(score);
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
