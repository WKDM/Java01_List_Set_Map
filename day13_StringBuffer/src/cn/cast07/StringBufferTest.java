package cn.cast07;
/*
 * String��StringBuffer���໥ת����
 * 
 * */
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hello";
		//ע�⣺StringBuffer����ֱ�Ӱ��ַ�����ֵ������
		//StringBuffer stringBuffer = "hello";//����
//		StringBuffer stringBuffer = string; //����
		
		
//		String----->StringBuffer
//		����1��ͨ�����췽��
		StringBuffer sBuffer = new StringBuffer(string);
//		����2��ͨ��append����
		StringBuffer stringBufferb = new StringBuffer();
		stringBufferb.append(string);
		System.out.println("sBuffer:"+sBuffer);
		System.out.println("stringBufferb:"+stringBufferb);
		System.out.println("===================");
		
//		StringBuffer------>String
		StringBuffer buffer = new StringBuffer("hello");
//		����1��ͨ�����췽��
		String str = new String(buffer);
//		����2��ͨ��toString()����
		String str2 = buffer.toString();
		System.out.println("str:"+str);
		System.out.println("str2:"+str2);
	}

}
