package cn.itCast02;

public class ExceptionDemo02 {

	public static void main(String[] args) {
		//�����쳣�Ĵ���
//		method2();
//		method3();
		method4();
	}

	public static void method2() {
		int a=100;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("��������Ϊ0");
		}
		int[] arr={1,2,3};
		try{
			System.out.println(arr[3]);
		}catch(Exception e){
			System.out.println("���������ǳ�������");
		}
		System.out.println("over");
	}
	
	
	
	public static void method3() {
		int a=100;
		int b=0;
		int[] arr={1,2,3};
		try {
			System.out.println(a/b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����ʵ����ݳ���");
		};	
		System.out.println("over");
		
	}
	
	
	//jdk7���쳣�Ĵ���
	public static void method4() {
		int a=100;
		int b=0;
		int[] arr={1,2,3};
		try {
			System.out.println(a/b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");			
		};
		System.out.println("over");
		
	}

}
