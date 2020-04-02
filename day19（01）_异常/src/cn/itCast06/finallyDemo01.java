package cn.itCast06;

public class finallyDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = getInt();
		System.out.println(a);
	}
	public static int getInt(){
		int a=10;
		try {			
			System.out.println(a/0);
			a=20;
		} catch (ArithmeticException e) {
			a=30;
			return a;
		}finally{
			a=40;
		}
		return a;
	}

}
