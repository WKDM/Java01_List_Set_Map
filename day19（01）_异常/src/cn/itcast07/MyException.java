package cn.itcast07;
/*
 * �Զ����쳣
 * A:�̳�exception
 * B:�̳�RuntimeException
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
