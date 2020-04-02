package cn.cast04;
/*
 * public static boolean isUppCase(char ch)判断是否为大写字母
 * public static boolean isLowerCase(char ch)判断是否为小写字母
 * public static boolean isDigit(char ch)判断是否为数字
 * public static char toUppCase(char ch)把给定的字符转化为大写字符
 * public static char toLowerCase(char ch)把给定的字符转化为小写字符
 * */
public class characterDemo {

	public static void main(String[] args) {
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isDigit('0'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
	}

}
