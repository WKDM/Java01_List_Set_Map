package cn.cast04;
/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ����������������ַ���
 * ����:"Hello123World"
 * �����
 * 		��д�ַ���2����
 * 		Сд�ַ���8����
 * 		�����ַ���3��
 * ������
 * 		A:��������ͳ�Ʊ���
 * 			bigCount = 0
 * 			smallCount = 0
 * 			numberCount = 0
 * 		B:�����ַ������õ�ÿһ���ַ�
 * 			length()��charAt()
 * 		C:�жϸ��ַ������������������͵�
 * 			��bigCount++
 * 			С��smallCout++
 * 			���֣�numberCount++
 * 		�ѵ㣺��ô�ж�ĳ���ַ����Ǵ�ģ�����С�ģ��������ֵ�
 * 			ASCII���
 * 				0:48
 * 				A:65
 * 				a:97
 * 			��Ȼ�����ǰ������ֵ����� �Ƚ��ǿ��Ե�
 * 				char ch = s.charAt(x);
 * 				if(ch >= '0' && ch <= '9') numberCount ++
 * 				if(ch >= 'a' && ch <= 'x') smallCount ++
 * 				if(ch >= 'A' && ch <= 'X')	bigCount ++
 * 		D:������
 * */
public class StringDemo02 {
	public static void main(String[] args) {
		String  str = "Hello123World";
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//�����ַ���
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9'){
				numberCount ++ ;
			}else if(ch >= 'a' && ch <= 'x'){
				smallCount ++;
			}else if(ch>='A' && ch <='X'){
				bigCount ++;
			}
		}
		System.out.println("��д��ĸ������"+bigCount+";\nСд��ĸ������"+smallCount+";\n���ָ�����"+numberCount);
	}
}
