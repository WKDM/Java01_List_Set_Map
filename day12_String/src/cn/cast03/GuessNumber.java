package cn.cast03;

import java.util.Random;
import java.util.Scanner;

/*
 * �����ֵ�С��Ϸ����
 * */
public class GuessNumber {
	
	public static void start(){
		//����һ�������
		int number = (int) (Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������µ�������1-100����");
		while(true){
			//����һ��1-100֮�������		
			int guessnum = sc.nextInt();
			
			if(guessnum>number){
				System.out.println("�����µ�����"+guessnum+"̫����");
			}else if(guessnum<number){
				System.out.println("���µ�����"+guessnum+"̫С��");
			}else{
				System.out.println("��ϲ��������");
				break;
			}
		}
	}
}
