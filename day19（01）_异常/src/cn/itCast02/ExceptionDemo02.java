package cn.itCast02;

public class ExceptionDemo02 {

	public static void main(String[] args) {
		//两个异常的处理
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
			System.out.println("除数不能为0");
		}
		int[] arr={1,2,3};
		try{
			System.out.println(arr[3]);
		}catch(Exception e){
			System.out.println("访问数组是超出长度");
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
			System.out.println("除数不能为0");			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("您访问的数据出街");
		};	
		System.out.println("over");
		
	}
	
	
	//jdk7对异常的处理
	public static void method4() {
		int a=100;
		int b=0;
		int[] arr={1,2,3};
		try {
			System.out.println(a/b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出问题啦");			
		};
		System.out.println("over");
		
	}

}
