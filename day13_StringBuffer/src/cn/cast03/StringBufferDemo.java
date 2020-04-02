package cn.cast03;
/*
 * StringBuffer的删除功能：
 * public StringBuffer deleteCharAt(int index){}删除指定位置的字符，并返回本身
 * public StringBuffer delete(int start,int end){}删除指定位置开始位置和指定结束位置的内容，并返回本身
 * 
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		//StringBuffer的添加功能
		sb.append("hello").append("world").append(13.14);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
	}

}
