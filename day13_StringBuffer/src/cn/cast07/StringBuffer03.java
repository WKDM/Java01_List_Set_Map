package cn.cast07;

import java.util.Scanner;

/*
 * �ж�������ַ����Ƿ�Ϊ�Գ�
 * */
public class StringBuffer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
		
		//����ʵ��
//		����һ��
		boolean result = isSame(str);
		System.out.println(result);
//		��������
		boolean result2 = isSame2(str);
		System.out.println(result2);
	}
//	����һ��
	public static boolean isSame(String str){
		boolean flag = true;
		char[] ch = str.toCharArray();
		for(int start = 0,end = ch.length-1;start<end;start++,end--){
			if(ch[start]!=ch[end]){
				flag = false;
			}
		}
		return flag;
	}
	
//	��������
	public static boolean isSame2(String str){
		return new StringBuffer(str).reverse().toString().equals(str);
	}

}
