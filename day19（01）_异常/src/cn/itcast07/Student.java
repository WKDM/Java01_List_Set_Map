package cn.itcast07;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("���������ķ�����");
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
