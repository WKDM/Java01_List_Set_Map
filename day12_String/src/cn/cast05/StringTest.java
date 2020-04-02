package cn.cast05;

public class StringTest {
	/*
	 * 分析：首字符大写
	 * 		A：获取第一个字符
	 * 		B：获取剩余的字符
	 * 		C:把A转化成大写
	 * 		D:把B转换成小写
	 * 		E:把CD拼接
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "helloWORLD";
		//获取第一个字符
		String s1 = string.substring(0,1);
		//获取其他字符
		String s2 = string.substring(1);
		
		//把第一个字符装化成大写
		String ss1 = s1.toUpperCase();
		//把其余字符转化成小写
		String ss2 = s2.toLowerCase();
		//拼接在一起
		String str = ss1.concat(ss2);
		System.out.println(str);
		
		
		//优化后的代码
		String result = string.substring(0,1).toUpperCase().concat(string.substring(1).toLowerCase());
		System.out.println(result);
	}

}
