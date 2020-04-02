package cn.cast03;

public class StringDemo {
/*判断功能	
 * 	boolean equals(Object obj):判断字符串是否相同，区分大小写
 * 	boolean equalsIgnoreCase(String str):判断字符串是否相同，忽略大小写
 * 	boolean contains(String str):判断大字符串中是否包含小字符串
 * 	boolean startsWith(String str):判断字符串是否以某个字符串开头
 *  boolean endsWith(String str):判断字符串是否以某个字符串结尾
 * 	boolean	isEmpty():判断字符串是否为空
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "helloworld";
		String str2 = "helloworld";
		String str3 = "Helloworld";
		String str4 = "";
		String str5 = null;//空指针错误，这是报空指针异常
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.contains("hello"));
		System.out.println(str1.contains("hw"));
		System.out.println(str1.startsWith("hello"));
		System.out.println(str1.startsWith("world"));
		System.out.println(str1.startsWith("hello"));
		System.out.println(str1.startsWith("world"));
		System.out.println(str1.endsWith("hello"));
		System.out.println(str1.endsWith("world"));
		System.out.println("===========");
		System.out.println(str4.isEmpty());
		System.out.println(str5.isEmpty());
	}

}
