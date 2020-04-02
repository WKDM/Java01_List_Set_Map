package cn.cast02;
/*
 * int类型与String的相互转化
 * 
 * int-------String
 * 
 * String-------int
 * */
public class IntegerDemo {

	public static void main(String[] args) {
		//int----->String
		//方法一
		int number = 100;
		String str1 = ""+number;
		System.out.println("str1:"+str1);
		//方法二
		String str2 = String.valueOf(number);
		System.out.println("str2:"+str2);
		//方法三	int---->Integer---->String
		Integer integer = new Integer(number);
		String str3 = integer.toString();
		System.out.println("str3:"+str3);
		//方法四  public static String toString(int i)
		String str4 = Integer.toString(number);
		System.out.println("str4:"+str4);
		
		
		//String------>int
		String string = "200";
		//方法一  String ---- Integer----int
		Integer ii = new Integer(string);
		//public int intValue()
		int num1 = ii.intValue();
		System.out.println("num:"+num1);
		//方法二 public static int parseInt()
		int num2 = integer.parseInt(string);
		System.out.println("num2:"+num2);		
	}
}
