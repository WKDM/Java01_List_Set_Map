package cn.itcast02;
//public static long currentTimeMillis()//�����Ժ���Ϊ��λ��ʱ��
public class SystemTest02 {
	public static void main(String[] args) {
		//�������й���ʱ
		long start =System.currentTimeMillis();
		for(int i=0;i<100;i++){
			System.out.println("Hello"+i);
		}
		long end = System.currentTimeMillis();
		System.out.println("�ܹ���ʱ��"+(end-start)+"����");
	}
}
