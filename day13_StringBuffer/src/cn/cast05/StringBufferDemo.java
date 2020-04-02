package cn.cast05;
/*
 * StringBuffer的反转功能
 * 	public StringBuffer reverse(){}
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("helloworld");
		System.out.println("sb翻转之前："+sb);
		sb.reverse();
		System.out.println("sb反转之后："+sb);
	}
}
