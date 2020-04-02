package cn.itCast02;
/*
 *:try……catch……finally的格式：
*	try{
*		//可能出现问题的代码
*	}catch(异常名变量){
*		//针对问题的处理
*	}finally{
*		//释放资源
*	}
*注意：try里的代码越少越好
*		catch里必须有内容，哪怕一个简单的提示
 * */

public class ExceptionDemo01 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		}
		System.out.println("over");

	}

}
