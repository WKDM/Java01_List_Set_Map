package cn.itCast01;

public class ExceptionDemo01 {

	public static void main(String[] args) {
		/*
		 * �쳣1������Ϊ0
		 * 		ArithmeticException:��java.lang.RuntimeException�����࣬���������⣬���Լ������⣨���벻�Ͻ���
		 * */
		int a = 10;
		int b = 0;
		//��һ�׶�
		System.out.println(a/b);
		//�ڶ��׶�
		System.out.println("over");
	}

}
