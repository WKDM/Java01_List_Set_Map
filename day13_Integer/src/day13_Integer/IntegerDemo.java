package day13_Integer;

public class IntegerDemo {
	
	/*
	 * Integer�Ĺ��췽��
	 * 	public Integer(int value)
	 * 	public Integer(String str)���ַ���ת��������
	 * 		ע�⣺�ַ����������������
	 * */
	public static void main(String[] args) {
		System.out.println("100�Ķ����ƣ�"+Integer.toBinaryString(100));
		System.out.println("100�İ˽��ƣ�"+Integer.toOctalString(100));
		System.out.println("100��ʮ�����ƣ�"+Integer.toHexString(100));
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
