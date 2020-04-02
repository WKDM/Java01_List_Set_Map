package cn.itcast02;

public class argsDemo {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		int result =sum(a,b);System.out.println(result);
	}
	
	public static int sum(int ...a){
		int s=0;
		for(int x:a){
			s+=x;
		}
		return s;
	}
}
