package cn.cast05;

import java.io.ObjectInputStream.GetField;

/*
 * String 的转换功能
 * byte[] getBytes():把字符串转换为字节数组
 * char[] toCharArray():把字符串转化为字符数组
 * static String valueOf(char[] chs):把字符数组转化成字符串
 * static String valueOf(int i):把int类型的数据转化成字符串
 * 		注意：String类的valueOf方法可以把任意类型的数据转换成字符串
 * String toLowerCase():把字符串改成小写
 * String toUpperCase():把字符串改成大写
 * String concat(String str):把字符串拼接
 * */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "JavaSE";
//		byte[] getBytes():把字符串转换为字节数组
		byte[] bys = s1.getBytes();
		for(int i=0;i<s1.length();i++){
			System.out.println(bys[i]);
		}
		System.out.println("====================");
		
		
//		char[] toCharArray():把字符串转化为字符数组
		char[] ch = s1.toCharArray();
		for(int i=0;i<s1.length();i++){
			System.out.println(ch[i]);
		}
		System.out.println("====================");
		

		//		static String valueOf(char[] chs):把字符数组转化成字符串
		String str01 = String.valueOf(ch);
		System.out.println(str01);
		System.out.println("====================");
		//		static String valueOf(int i):把int类型的数据转化成字符串
		int i = 100;
		System.out.println(i);
		System.out.println("====================");
		//		 		注意：String类的valueOf方法可以把任意类型的数据转换成字符串
		
		//		String toLowerCase():把字符串改成小写
		System.out.println(s1.toLowerCase());
		//		String toUpperCase():把字符串改成大写
		System.out.println(s1.toUpperCase());
		//		String concat(String str):把字符串拼接
		String s2 = "我的最爱";
		System.out.println(s1.concat(s2));
	}

}
