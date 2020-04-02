package cn.itcast07;
/*
 * 自定义异常
 * A:继承exception
 * B:继承RuntimeException
 * */
public class MyException extends Exception{
	public MyException(){}
	public MyException(String Message){
		super(Message);
	}
}

//public class MyException extends RuntimeException{
//	
//}
