package cn.cast04;
/*
 * StringBuffer的替换功能
 * 		public StringBuffer replace(int start,int end,String str){}
 * 		从指定位置开始到指定结束位置替换成指定的字符串
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb替换前："+sb);
		sb.replace(5,10,"节日快乐");
		System.out.println("sb替换后："+sb);
	}

}
