package cn.cast03;
/*
 * JDK5�������ԣ�
 * 		�Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
 * 		�Զ����䣺�Ѱ�װ������ת��Ϊ��������
 * */
public class Demo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		Integer in2 = 100;
		in2 += 200;
		System.out.println(in2);
		
//		������		
		Integer ii = Integer.valueOf(100);//�Զ�װ��
		ii = Integer.valueOf(ii.intValue()+200);//���Զ����䣬���Զ�װ��
		System.out.println(new StringBuilder("ii:").append(ii).toString());
	}
}
