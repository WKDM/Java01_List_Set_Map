package cn.itcast03;

import java.util.ArrayList;
import java.util.Random;

public class ListDemo {

	public static void main(String[] args) {
	/*
	 * 集合的嵌套遍历：
	 * 获取10个1-20之间的随机数，要求不能重复 
	 * 分析：
	 * 		A:创建产生随机数的对象
	 * 		B:创建一个存储随机数的集合
	 * 		C:定义一个统计变量，从0开始，
	 * 		D:判断统计变量是否小于10
	 * 			是：先产生一个随机数，看集合中是否存在，如果不存在就添加，Count++；存在就不搭理他
	 * 			否：不搭理他
	 * 		E:遍历集合  		
	 * */
		Random rd = new Random();
		ArrayList<Integer> al =new ArrayList<Integer>();
		
		int count=0;
		while(count<10){
			int num = rd.nextInt(20)+1;
			if(!al.contains(num)){
				al.add(num);
				count++;
			}			
		}
		//遍历数组
		for(Integer x:al){
			System.out.println(x);
		}
	}

}
