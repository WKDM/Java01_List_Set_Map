package cn.itcast03;

import java.util.ArrayList;
import java.util.Random;

public class ListDemo {

	public static void main(String[] args) {
	/*
	 * ���ϵ�Ƕ�ױ�����
	 * ��ȡ10��1-20֮����������Ҫ�����ظ� 
	 * ������
	 * 		A:��������������Ķ���
	 * 		B:����һ���洢������ļ���
	 * 		C:����һ��ͳ�Ʊ�������0��ʼ��
	 * 		D:�ж�ͳ�Ʊ����Ƿ�С��10
	 * 			�ǣ��Ȳ���һ������������������Ƿ���ڣ���������ھ���ӣ�Count++�����ھͲ�������
	 * 			�񣺲�������
	 * 		E:��������  		
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
		//��������
		for(Integer x:al){
			System.out.println(x);
		}
	}

}
