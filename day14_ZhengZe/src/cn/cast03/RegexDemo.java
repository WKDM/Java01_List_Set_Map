package cn.cast03;

import java.util.Scanner;

/*
 * �ָ��
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
		//�õ�int ���͵�
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		Scanner sc = new Scanner(System.in);
		System.out.print("����������Ҫ�����䣺");
		int needAge = sc.nextInt();
		if(needAge >=startAge && needAge<=endAge){
			System.out.println("��ʽ����Ҫ��");
		}else{
			System.out.println("��������Ҫ�ģ�gun");
		}
	}
}
