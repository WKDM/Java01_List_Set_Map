package cn.cast04;
/*
 * public static boolean isUppCase(char ch)�ж��Ƿ�Ϊ��д��ĸ
 * public static boolean isLowerCase(char ch)�ж��Ƿ�ΪСд��ĸ
 * public static boolean isDigit(char ch)�ж��Ƿ�Ϊ����
 * public static char toUppCase(char ch)�Ѹ������ַ�ת��Ϊ��д�ַ�
 * public static char toLowerCase(char ch)�Ѹ������ַ�ת��ΪСд�ַ�
 * */
public class characterDemo {

	public static void main(String[] args) {
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isDigit('0'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
	}

}
