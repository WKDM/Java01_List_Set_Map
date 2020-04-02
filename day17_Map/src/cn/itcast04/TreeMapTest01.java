package cn.itcast04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * aababcabcdabcde  ��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ������
 * a(5);b(4);c(3);d(2);e(1)
 * 
 * ����һ���ַ��������Ը�Ϊ����¼�룩
 * ����һ��TreeMap����
 * 		Character:
 * 		Integer:
 * ���ַ���ת��Ϊ�ַ�����
 * �����ַ����飬�õ�ÿһ���ַ�
 * �øղŵõ����ַ�����Ϊ����������ȥ��ֵ��������ֵ
 * 		��null����˵�������ڣ��Ͱ��ַ���Ϊ����1��Ϊֵ��ӵ�������
 * 		����null����˵�����ڣ��Ͱ�ֵ+1
 * �����ַ����������������õ�����ֵ�����а���Ҫ��ƴ��
 * ���ַ���������ת��Ϊ�ַ������
 * */
public class TreeMapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����һ���ַ��������Ը�Ϊ����¼�룩
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line = sc.nextLine();
		
//		����һ��TreeMap����
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
//		���ַ���ת��Ϊ�ַ�����
		char[] chs = line.toCharArray();
//		�����ַ����飬�õ�ÿһ���ַ�
		for(char ch:chs){			
			Integer i = tm.get(ch);
//			�øղŵõ����ַ�����Ϊ����������ȥ��ֵ��������ֵ
			if(i==null){
//				��null����˵�������ڣ��Ͱ��ַ���Ϊ����1��Ϊֵ��ӵ�������
				tm.put(ch, 1);
			}else{
//				����null����˵�����ڣ��Ͱ�ֵ+1
				i++;
				tm.put(ch, i);
			}			
		}
		StringBuilder sb =new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character key:set){
			Integer value = tm.get(key);
			sb.append(key).append("{").append(value).append("}");			
		}
//		���ַ���������ת��Ϊ�ַ������
		String result = sb.toString();
		System.out.println("result:"+result);
	}

}
