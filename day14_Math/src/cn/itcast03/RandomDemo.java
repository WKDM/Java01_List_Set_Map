package cn.itcast03;

import java.util.Random;

/*
 * Random的方法
 * 构造方法：
 * 		public Random()没有种子，按照当前毫秒时间
 * 		public Random(long seed)给出制定的种子
 * 			给定种子后每次得到的随机数都是相同的
 * 成员方法：
 * 		public static int nextInt(){}返回的是int类型的随机数
 * 		public static int nextInt(int n){}返回的是0-n之间的随机数
 * */
public class RandomDemo {
	public static void main(String[] args) {
//		Random random= new Random();
		Random random= new Random(10);
		for(int i=0;i<=10;i++){
			int num = random.nextInt();
			int num1 = random.nextInt(100);
			System.out.println("random.nextInt():"+num);
			System.out.println("random.nextInt(100):"+num1);
		}
	}
}
