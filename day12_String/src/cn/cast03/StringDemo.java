package cn.cast03;

public class StringDemo {
/*�жϹ���	
 * 	boolean equals(Object obj):�ж��ַ����Ƿ���ͬ�����ִ�Сд
 * 	boolean equalsIgnoreCase(String str):�ж��ַ����Ƿ���ͬ�����Դ�Сд
 * 	boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 * 	boolean startsWith(String str):�ж��ַ����Ƿ���ĳ���ַ�����ͷ
 *  boolean endsWith(String str):�ж��ַ����Ƿ���ĳ���ַ�����β
 * 	boolean	isEmpty():�ж��ַ����Ƿ�Ϊ��
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "helloworld";
		String str2 = "helloworld";
		String str3 = "Helloworld";
		String str4 = "";
		String str5 = null;//��ָ��������Ǳ���ָ���쳣
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.contains("hello"));
		System.out.println(str1.contains("hw"));
		System.out.println(str1.startsWith("hello"));
		System.out.println(str1.startsWith("world"));
		System.out.println(str1.startsWith("hello"));
		System.out.println(str1.startsWith("world"));
		System.out.println(str1.endsWith("hello"));
		System.out.println(str1.endsWith("world"));
		System.out.println("===========");
		System.out.println(str4.isEmpty());
		System.out.println(str5.isEmpty());
	}

}
