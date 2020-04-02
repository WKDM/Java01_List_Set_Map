package cn.cast03;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字的小游戏代码
 * */
public class GuessNumber {
	
	public static void start(){
		//产生一个随机数
		int number = (int) (Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜的整数（1-100）：");
		while(true){
			//键入一个1-100之间的整数		
			int guessnum = sc.nextInt();
			
			if(guessnum>number){
				System.out.println("您所猜的数："+guessnum+"太大了");
			}else if(guessnum<number){
				System.out.println("您猜的数："+guessnum+"太小了");
			}else{
				System.out.println("恭喜您猜中了");
				break;
			}
		}
	}
}
