package cn.itcast02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * A:创建一个牌盒(集合)
 * B:装牌
 * C:洗牌
 * D:发牌
 * E:看牌
 * */
public class PokerDemo {
	public static void main(String[] args) {
//		创建一个牌盒(集合)
		ArrayList<String> array = new ArrayList<String>();
//		B:装牌
		/*
		 * 黑桃A，黑桃2……
		 * 红桃A，红桃2……
		 * 方块A，方块2……
		 * 梅花A，梅花2…… 
		 * */
		//定义一个花色数组
		String[] colors = {"♠","♥","♦","♣"};
		String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(String color:colors){
			for(String number:numbers){
				String poker = color.concat(number);
				array.add(poker);
			}
		}
		array.add("小王");
		array.add("大王");
		System.out.println("新买Poker"+array);
		//C:洗牌
		Collections.shuffle(array);
		System.out.println("洗牌Poker"+array);
		//D:发牌
		//定义三个玩家（集合）和底牌
		ArrayList<String> player1 =new ArrayList<String>();
		ArrayList<String> player2 =new ArrayList<String>();
		ArrayList<String> player3 =new ArrayList<String>();
		ArrayList<String> dipai =new ArrayList<String>();
		for(int x=0;x<array.size();x++){
			if(x>=array.size()-3){
				dipai.add(array.get(x));
			}else if(x%3==0){
				player1.add(array.get(x));
			}else if(x%3==1){
				player2.add(array.get(x));
			}else if(x%3==2){
				player3.add(array.get(x));
			}
		}		
		//E:看牌
		lookPoker("玩家1", player1);
		lookPoker("玩家2", player2);
		lookPoker("玩家3", player3);
		lookPoker("底", dipai);
	}	
	public static void lookPoker(String name,ArrayList<String> array){
		System.out.print(name+"牌是：");
		for(String poker:array){
			System.out.print(poker+" ");
		}
		System.out.println();
	}
}
