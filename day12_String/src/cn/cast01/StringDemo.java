package cn.cast01;
/*
*	字符串：就是多个字符组成的一串数据，也可以看成一个字符数组
*	通过API，我们可以知道
*	A：字符串“abc”也可以看成一个字符串
*	B：字符串是常量，一旦被赋值就不能被改变。
*	构造方法：
	*	public String()		空构造
	*	public String(byte[] bytes)	把字节数组转换成字符串
	*	public String(byte[] bytes,int offset,int length)	把字节数组的一部分改为字符串
	*	public String(char[] value)	把字符数组转化成字符串
	*	public String(char[] value,int offseet,int length)把字符数组的一部分转化成字符串
	*	public String(String original)	把字符串常量值转化成字符串
*/
public class StringDemo {
	public static void main(String[] args) {
		String str = new String();
		System.out.println("str:"+str);
		System.out.println("str.length():"+str.length());
		System.out.println("====================");
		
		
//		public String(byte[] bytes)	把字节数组转换成字符串
		
		byte[] bytes = {97,98,99,100,101,102};
		String str2 = new String(bytes);
		System.out.println("str2:"+str2);
		System.out.println("str2.length():"+str2.length());
		System.out.println("====================");
		
//		想要得到字符串bcd
		String str3 = new String(bytes,1,3);
		System.out.println("str3:"+str3);
		System.out.println("str3.length():"+str3.length());
		System.out.println("====================");
		
//		public String(char[] value)	把字符数组转化成字符串
		
		char[] ch = {'f','e','d','c','b','a','哎','林','亲'};
		String str4 = new String(ch);
		System.out.println("str4:"+str4);
		System.out.println("str4.length():"+str4.length());
		System.out.println("====================");
		
		
//		public String(char[] value,int offseet,int length)把字符数组的一部分转化成字符串
		String str5 = new String(ch,5,4);
		System.out.println("str5:"+str5);
		System.out.println("str5.length():"+str5.length());
		System.out.println("====================");	
		
		
//		public String(String original)	把字符串常量值转化成字符串
	}
}
