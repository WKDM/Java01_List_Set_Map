package cn.itCast02;
/*
 *:try����catch����finally�ĸ�ʽ��
*	try{
*		//���ܳ�������Ĵ���
*	}catch(�쳣������){
*		//�������Ĵ���
*	}finally{
*		//�ͷ���Դ
*	}
*ע�⣺try��Ĵ���Խ��Խ��
*		catch����������ݣ�����һ���򵥵���ʾ
 * */

public class ExceptionDemo01 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		}
		System.out.println("over");

	}

}
