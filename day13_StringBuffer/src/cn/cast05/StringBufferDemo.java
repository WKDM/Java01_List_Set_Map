package cn.cast05;
/*
 * StringBuffer�ķ�ת����
 * 	public StringBuffer reverse(){}
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("helloworld");
		System.out.println("sb��ת֮ǰ��"+sb);
		sb.reverse();
		System.out.println("sb��ת֮��"+sb);
	}
}
