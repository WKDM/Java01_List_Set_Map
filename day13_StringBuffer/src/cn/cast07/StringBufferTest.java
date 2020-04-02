package cn.cast07;
/*
 * String和StringBuffer的相互转换：
 * 
 * */
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hello";
		//注意：StringBuffer不能直接把字符串的值付给它
		//StringBuffer stringBuffer = "hello";//错误
//		StringBuffer stringBuffer = string; //错误
		
		
//		String----->StringBuffer
//		方法1：通过构造方法
		StringBuffer sBuffer = new StringBuffer(string);
//		方法2：通过append方法
		StringBuffer stringBufferb = new StringBuffer();
		stringBufferb.append(string);
		System.out.println("sBuffer:"+sBuffer);
		System.out.println("stringBufferb:"+stringBufferb);
		System.out.println("===================");
		
//		StringBuffer------>String
		StringBuffer buffer = new StringBuffer("hello");
//		方法1：通过构造方法
		String str = new String(buffer);
//		方法2：通过toString()方法
		String str2 = buffer.toString();
		System.out.println("str:"+str);
		System.out.println("str2:"+str2);
	}

}
