package cn.cast04;
/*
 * int length():获取字符串的长度
 * char charAt(int ch):获取给定索引处的字符（用int是因为可以使‘a’，也可以是97）
 * int indexOf(int ch):获取字符第一次出现的位置
 * int indexOf(String str):获取字符串第一次出现的位置
 * int indexOf(int ch,int fromIndex):返回字符在指定位置以后第一次出现的位置
 * int indexOf(String str,fromIndex):返回字符串在指定位置以后第一次出现的位置
 * String substring(int start):获截取从指定位置到结尾的字符串
 * String substring(int start,int end):截取从指定位置到指定结束为止的字符串
 * */
public class StringDemo {
	public static void main(String[] args) {
		//定义一个字符
		String str = "helloworld";
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("owo"));
		System.out.println(str.indexOf('l',4));
		System.out.println(str.indexOf("ol",3));
		System.out.println(str.substring(4));
		System.out.println(str.substring(3,7));
	}
}
