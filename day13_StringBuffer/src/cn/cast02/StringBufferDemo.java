package cn.cast02;
/*
 * StringBuffer的添加功能：
 * public StringBuffer append(Sting str):可以把任意字符添加到缓冲区中，并返回字符串本身
 * public StringBuffer insert(int offset,String str):在指定位置，把任意字符串类型插入到字符串缓冲区里
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		StringBuffer sb1 = sb.append("hello");
		//sb1是把sb添加后的值赋值的，sb添加了值
		System.out.println("sb:"+sb);
		System.out.println("sb1:"+sb1);
		System.out.println(sb==sb1);
		
		//一个一个的添加
//		sb.append("hello");
//		sb.append("wew");
//		sb.append(true);
//		sb.append(13.12);
		//相当于链式编程
		sb.append("hello").append("wew").append(true).append(13.12);
		System.out.println("sb:"+sb);
		
		sb.insert(5,"world");
		System.out.println("sb:"+sb);
	}
}
