package cn.cast01;
/*
 * StringBuffer的构造方法：
*	public StringBuffer()：无参构造
*	public StringBuffer(int capacity)制定容量字符串内容的缓冲区对象
*	public StringBuffer(String str)：制定字符串内容的缓冲区对象
*
*	StringBuffer的方法：
*	public int capacity(){}返回当前容量		理论值
*	public int length(){}返回当前字符的个数  实际值
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		System.out.println("sb:"+sb);
		System.out.println("sb.capacity():"+sb.capacity());
		System.out.println("sb.length():"+sb.length());
		System.out.println("=====================");
		StringBuffer sb1 = new StringBuffer(50);
		System.out.println("sb1:"+sb1);
		System.out.println("sb1.capacity():"+sb1.capacity());
		System.out.println("sb1.length():"+sb1.length());
		System.out.println("=====================");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println("sb2:"+sb2);
		System.out.println("sb2.capacity():"+sb2.capacity());
		System.out.println("sb2.length():"+sb2.length());
		System.out.println("=====================");		
		
	}
}
