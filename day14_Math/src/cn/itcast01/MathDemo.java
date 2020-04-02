package cn.itcast01;import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/*
 * public static final double PI()
 * public static final double E()
 * public static int abs()取绝对值
 * public static double ceil()向上取整
 * public static double floor()向下取整
 * public static int max(int a,int b)
 * public static double pow(double a,double b)取a的b次幂
 * public static double random()随机数（0.0-1.0）
 * public static double round(float a)四舍五入
 * public static double sqrt(double a)正平方根
 * */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println("Math:PI="+Math.PI);
		System.out.println("Math:E="+Math.E);
		System.out.println("-----------------");
		System.out.println("abs取绝对值："+Math.abs(10));
		System.out.println("abs取绝对值："+Math.abs(-10));
		System.out.println("-----------------");
		System.out.println("ceil向上取整:"+Math.ceil(13.86));
		System.out.println("ceil向上取整:"+Math.ceil(13.46));
		System.out.println("-----------------");
		System.out.println("floor向下取整:"+Math.floor(13.46));
		System.out.println("floor向下取整:"+Math.floor(13.86));
		System.out.println("-----------------");
		System.out.println("Max求最值："+Math.max(13, 12));
		System.out.println("-----------------");
		System.out.println("pow取a的b次幂:"+Math.pow(2, 3));
		System.out.println("-----------------");
		System.out.println("random随机数（0.0-1.0）:"+(int)(Math.random()*10));
		System.out.println("-----------------");
		System.out.println("sqrt正平方根"+Math.sqrt(9));
	}
}
