package cn.cast04;
/*
 * �����ַ������õ�ÿһ���ַ�
 * ������
 * 		A����β��ܵõ�һ���ַ�
 * 			int charAt(int ch)
 * 		B:���֪���ж��ٸ��ַ�
 * 			int length()
 * */
public class StringTest {

	public static void main(String[] args) {
		//����һ���ַ���
		String str = "helloworld";
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
		
	}

}
