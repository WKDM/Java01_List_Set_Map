package cn.itcast03;

import java.util.Random;

/*
 * Random�ķ���
 * ���췽����
 * 		public Random()û�����ӣ����յ�ǰ����ʱ��
 * 		public Random(long seed)�����ƶ�������
 * 			�������Ӻ�ÿ�εõ��������������ͬ��
 * ��Ա������
 * 		public static int nextInt(){}���ص���int���͵������
 * 		public static int nextInt(int n){}���ص���0-n֮��������
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
