package cn.cast05;

public class StringTest {
	/*
	 * ���������ַ���д
	 * 		A����ȡ��һ���ַ�
	 * 		B����ȡʣ����ַ�
	 * 		C:��Aת���ɴ�д
	 * 		D:��Bת����Сд
	 * 		E:��CDƴ��
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "helloWORLD";
		//��ȡ��һ���ַ�
		String s1 = string.substring(0,1);
		//��ȡ�����ַ�
		String s2 = string.substring(1);
		
		//�ѵ�һ���ַ�װ���ɴ�д
		String ss1 = s1.toUpperCase();
		//�������ַ�ת����Сд
		String ss2 = s2.toLowerCase();
		//ƴ����һ��
		String str = ss1.concat(ss2);
		System.out.println(str);
		
		
		//�Ż���Ĵ���
		String result = string.substring(0,1).toUpperCase().concat(string.substring(1).toLowerCase());
		System.out.println(result);
	}

}
