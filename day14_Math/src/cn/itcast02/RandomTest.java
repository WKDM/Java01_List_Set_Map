package cn.itcast02;

import java.util.Scanner;

public class RandomTest {
	/*
	 * �����ȡһ����Χ�ڵ������
	 * ����start��endֵ
	 * ��취��ȡ���м��ֵ
	 * ���
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = sc.nextInt();
		System.out.println("�������������");
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
