package cn.cast03;
/*
 * StringBuffer��ɾ�����ܣ�
 * public StringBuffer deleteCharAt(int index){}ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delete(int start,int end){}ɾ��ָ��λ�ÿ�ʼλ�ú�ָ������λ�õ����ݣ������ر���
 * 
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		//StringBuffer����ӹ���
		sb.append("hello").append("world").append(13.14);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
	}

}
