package day13_Integer;

public class IntegerDemo {
	
	/*
	 * Integer的构造方法
	 * 	public Integer(int value)
	 * 	public Integer(String str)把字符串转换成整数
	 * 		注意：字符串必须是数字组成
	 * */
	public static void main(String[] args) {
		System.out.println("100的二进制："+Integer.toBinaryString(100));
		System.out.println("100的八进制："+Integer.toOctalString(100));
		System.out.println("100的十六进制："+Integer.toHexString(100));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int i=100;
		Integer ii = new Integer(i);
		System.out.println("ii:"+ii);
		String s="123";
		Integer iii=new Integer(s);
		System.out.println("iii:"+iii);
		
	}
}
