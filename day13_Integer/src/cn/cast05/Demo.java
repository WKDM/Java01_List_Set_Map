package cn.cast05;

import java.util.Scanner;

public class Demo {

	private static final boolean isDigit = false;

	public static void main(String[] args) {
		int BigCount=0;
		int SmallCount=0;
		int NumberCount=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		//���ַ���ת��Ϊ����
		char[] ch = str.toCharArray();	
		for(int i=0;i<ch.length-1;i++){
			if(Character.isUpperCase(ch[i])){
				BigCount++;
			}else if(Character.isLowerCase(ch[i])){
				SmallCount++;
			}else if(Character.isDigit(ch[i])){
				NumberCount++;
			}
		}
		System.out.println("��д�ַ�ĸ����Ϊ��"+BigCount+"\nСд��ĸ����Ϊ��"+SmallCount+"\n���ָ�����"+NumberCount);
	}
}
