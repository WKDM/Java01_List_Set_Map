package cn.cast02;

public class StringDemo {
/*
 * String str = "hello"��String str = new String("hello")������
 * 		��==�����Ƚ��������ͱȽϵ��ǵ�ֵַ�Ƿ���ͬ
 * 		equals:�Ƚ��������ͱȽϵ��������Ƿ���ͬ��String����д��equals��������,�Ƚϵ��������Ƿ���ͬ
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str2 = new String("hello");
		System.out.println(str==str2);//false
		System.out.println(str.equals(str2));//true
	}

}
