package cn.itcast03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * 思路：
 * 		A:创建1个HashMap集合
 * 		B:创建一个ArrayList集合
 * 		C:创建花色数组的点数
 * 		D:从0开始向HashMap中存储编号为Key，并存储对应的牌
 * 			同时往ArrayList里储存对应的编号即可
 * 		E:洗牌（洗编号）
 * 		F:发牌（发编号，为了保证编号是有序的，就创建TreeSet集合接受）
 * 		G:看牌（获取TreeSet编号，到HashMap中找对应的牌）
 * */
public class PokerDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A:创建1个HashMap集合
		HashMap<Integer, String> hm =new HashMap<Integer,String>();
//		B:创建一个ArrayList集合
		ArrayList<Integer> array =new ArrayList<Integer>();
//		C:创建花色数组的点数
		String[] colors = {"♠","♥","♦","♣"};
		String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
//		D:从0开始向HashMap中存储编号为Key，并存储对应的牌
		//组牌
		int index=0;
		
		for(String number:numbers){
			for(String color:colors){
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index,"小王");
		array.add(index);
		index++;
		hm.put(index,"大王");
		array.add(index);
//		E:洗牌（洗编号）
		Collections.shuffle(array);
//		F:发牌（发编号，为了保证编号是有序的，就创建TreeSet集合接受）
		TreeSet<Integer> p1 = new TreeSet<Integer>();
		TreeSet<Integer> p2 = new TreeSet<Integer>();
		TreeSet<Integer> p3 = new TreeSet<Integer>();
		TreeSet<Integer> di = new TreeSet<Integer>();
		for(int x=0;x<array.size();x++){
			if(x>=array.size()-3){
				di.add(array.get(x));
			}else if(x%3==0){
				p1.add(array.get(x));
			}else if(x%3==1){
				p2.add(array.get(x));
			}else if(x%3==2){
				p3.add(array.get(x));
			}
		}
		
//		G:看牌（获取TreeSet编号，到HashMap中找对应的牌）
		lookPoker("p1",p1,hm);
		lookPoker("p2",p2,hm);
		lookPoker("p3",p3,hm);
		lookPoker("di",di,hm);
	}
	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
		System.out.print(name+"牌是：");
		for(Integer key:ts){
			String pai = hm.get(key);
			System.out.print(pai+" ");
		}
		System.out.println();
	}
}
