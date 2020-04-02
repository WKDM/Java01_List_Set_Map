package cn.cast04;
/*
 * 遍历字符串，得到每一个字符
 * 分析：
 * 		A：如何才能得到一个字符
 * 			int charAt(int ch)
 * 		B:如何知道有多少个字符
 * 			int length()
 * */
public class StringTest {

	public static void main(String[] args) {
		//定义一个字符串
		String str = "helloworld";
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
		
	}

}
