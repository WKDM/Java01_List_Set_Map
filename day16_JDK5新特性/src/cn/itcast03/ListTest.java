package cn.itcast03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListTest {
	/*
	 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
	 * ������
	 * 		A:��������¼�����ݶ���
	 * 		B:����¼�������ݣ�������ʱ��֪�����ٸ�����ʹ�ü���
	 * 		C:������������Ϊ0����ͽ���
	 * 		D:�Ѽ���ת�����飬
	 * 		E:�������������
	 * 		F:��ȡ��������������ֵ
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> array =new ArrayList<Integer>();
		while(true){
			System.out.println("���������ݣ�");
			int num = scn.nextInt();
			if(num!=0){
				array.add(num);				
			}else{
				break;
			}			
		}
		//������ת��Ϊ����
		Integer[] i = new Integer[array.size()];
//		Integer[] ii =array.toArray(i);
		array.toArray(i);
		Arrays.sort(i);
		System.out.println(i[i.length-1]);
	}
	
}
