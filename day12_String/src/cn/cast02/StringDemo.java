package cn.cast02;

public class StringDemo {
/*
 * String str = "hello"与String str = new String("hello")的区别？
 * 		“==”：比较引用类型比较的是地址值是否相同
 * 		equals:比较引用类型比较的是内容是否相同，String类重写了equals（）方法,比较的是内容是否相同
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str2 = new String("hello");
		System.out.println(str==str2);//false
		System.out.println(str.equals(str2));//true
	}

}
