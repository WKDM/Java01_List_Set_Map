package cn.cast02;
/*
 * StringBuffer����ӹ��ܣ�
 * public StringBuffer append(Sting str):���԰������ַ���ӵ��������У��������ַ�������
 * public StringBuffer insert(int offset,String str):��ָ��λ�ã��������ַ������Ͳ��뵽�ַ�����������
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		StringBuffer sb1 = sb.append("hello");
		//sb1�ǰ�sb��Ӻ��ֵ��ֵ�ģ�sb�����ֵ
		System.out.println("sb:"+sb);
		System.out.println("sb1:"+sb1);
		System.out.println(sb==sb1);
		
		//һ��һ�������
//		sb.append("hello");
//		sb.append("wew");
//		sb.append(true);
//		sb.append(13.12);
		//�൱����ʽ���
		sb.append("hello").append("wew").append(true).append(13.12);
		System.out.println("sb:"+sb);
		
		sb.insert(5,"world");
		System.out.println("sb:"+sb);
	}
}
