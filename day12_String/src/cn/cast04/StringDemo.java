package cn.cast04;
/*
 * int length():��ȡ�ַ����ĳ���
 * char charAt(int ch):��ȡ�������������ַ�����int����Ϊ����ʹ��a����Ҳ������97��
 * int indexOf(int ch):��ȡ�ַ���һ�γ��ֵ�λ��
 * int indexOf(String str):��ȡ�ַ�����һ�γ��ֵ�λ��
 * int indexOf(int ch,int fromIndex):�����ַ���ָ��λ���Ժ��һ�γ��ֵ�λ��
 * int indexOf(String str,fromIndex):�����ַ�����ָ��λ���Ժ��һ�γ��ֵ�λ��
 * String substring(int start):���ȡ��ָ��λ�õ���β���ַ���
 * String substring(int start,int end):��ȡ��ָ��λ�õ�ָ������Ϊֹ���ַ���
 * */
public class StringDemo {
	public static void main(String[] args) {
		//����һ���ַ�
		String str = "helloworld";
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("owo"));
		System.out.println(str.indexOf('l',4));
		System.out.println(str.indexOf("ol",3));
		System.out.println(str.substring(4));
		System.out.println(str.substring(3,7));
	}
}
