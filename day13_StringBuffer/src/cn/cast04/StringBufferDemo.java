package cn.cast04;
/*
 * StringBuffer���滻����
 * 		public StringBuffer replace(int start,int end,String str){}
 * 		��ָ��λ�ÿ�ʼ��ָ������λ���滻��ָ�����ַ���
 * */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb�滻ǰ��"+sb);
		sb.replace(5,10,"���տ���");
		System.out.println("sb�滻��"+sb);
	}

}
