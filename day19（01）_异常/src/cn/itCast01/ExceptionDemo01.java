package cn.itCast01;

public class ExceptionDemo01 {

	public static void main(String[] args) {
		/*
		 * 异常1：除数为0
		 * 		ArithmeticException:是java.lang.RuntimeException的子类，是运行问题，是自己的问题（代码不严谨）
		 * */
		int a = 10;
		int b = 0;
		//第一阶段
		System.out.println(a/b);
		//第二阶段
		System.out.println("over");
	}

}
