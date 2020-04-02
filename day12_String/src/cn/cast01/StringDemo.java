package cn.cast01;
/*
*	�ַ��������Ƕ���ַ���ɵ�һ�����ݣ�Ҳ���Կ���һ���ַ�����
*	ͨ��API�����ǿ���֪��
*	A���ַ�����abc��Ҳ���Կ���һ���ַ���
*	B���ַ����ǳ�����һ������ֵ�Ͳ��ܱ��ı䡣
*	���췽����
	*	public String()		�չ���
	*	public String(byte[] bytes)	���ֽ�����ת�����ַ���
	*	public String(byte[] bytes,int offset,int length)	���ֽ������һ���ָ�Ϊ�ַ���
	*	public String(char[] value)	���ַ�����ת�����ַ���
	*	public String(char[] value,int offseet,int length)���ַ������һ����ת�����ַ���
	*	public String(String original)	���ַ�������ֵת�����ַ���
*/
public class StringDemo {
	public static void main(String[] args) {
		String str = new String();
		System.out.println("str:"+str);
		System.out.println("str.length():"+str.length());
		System.out.println("====================");
		
		
//		public String(byte[] bytes)	���ֽ�����ת�����ַ���
		
		byte[] bytes = {97,98,99,100,101,102};
		String str2 = new String(bytes);
		System.out.println("str2:"+str2);
		System.out.println("str2.length():"+str2.length());
		System.out.println("====================");
		
//		��Ҫ�õ��ַ���bcd
		String str3 = new String(bytes,1,3);
		System.out.println("str3:"+str3);
		System.out.println("str3.length():"+str3.length());
		System.out.println("====================");
		
//		public String(char[] value)	���ַ�����ת�����ַ���
		
		char[] ch = {'f','e','d','c','b','a','��','��','��'};
		String str4 = new String(ch);
		System.out.println("str4:"+str4);
		System.out.println("str4.length():"+str4.length());
		System.out.println("====================");
		
		
//		public String(char[] value,int offseet,int length)���ַ������һ����ת�����ַ���
		String str5 = new String(ch,5,4);
		System.out.println("str5:"+str5);
		System.out.println("str5.length():"+str5.length());
		System.out.println("====================");	
		
		
//		public String(String original)	���ַ�������ֵת�����ַ���
	}
}
