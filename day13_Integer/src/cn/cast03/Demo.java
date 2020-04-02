package cn.cast03;
/*
 * JDK5的新特性：
 * 		自动装箱：把基本类型转换为包装类类型
 * 		自动拆箱：把包装类类型转换为基本类型
 * */
public class Demo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		Integer in2 = 100;
		in2 += 200;
		System.out.println(in2);
		
//		反编译		
		Integer ii = Integer.valueOf(100);//自动装箱
		ii = Integer.valueOf(ii.intValue()+200);//先自动拆箱，在自动装箱
		System.out.println(new StringBuilder("ii:").append(ii).toString());
	}
}
