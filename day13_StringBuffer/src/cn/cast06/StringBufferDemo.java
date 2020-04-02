package cn.cast06;
/*
 * StringBuffer的截取功能：
 * 	public String substring(int start):
 * 	public String substring(int start,int end)
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append("Hello").append("world").append("java");
		System.out.println("s:"+s);
		String sb= s.substring(5);		
		System.out.println("sb:"+sb);
		System.out.println("s:"+s);
		
	}
}
