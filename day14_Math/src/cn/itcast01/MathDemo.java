package cn.itcast01;import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/*
 * public static final double PI()
 * public static final double E()
 * public static int abs()ȡ����ֵ
 * public static double ceil()����ȡ��
 * public static double floor()����ȡ��
 * public static int max(int a,int b)
 * public static double pow(double a,double b)ȡa��b����
 * public static double random()�������0.0-1.0��
 * public static double round(float a)��������
 * public static double sqrt(double a)��ƽ����
 * */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println("Math:PI="+Math.PI);
		System.out.println("Math:E="+Math.E);
		System.out.println("-----------------");
		System.out.println("absȡ����ֵ��"+Math.abs(10));
		System.out.println("absȡ����ֵ��"+Math.abs(-10));
		System.out.println("-----------------");
		System.out.println("ceil����ȡ��:"+Math.ceil(13.86));
		System.out.println("ceil����ȡ��:"+Math.ceil(13.46));
		System.out.println("-----------------");
		System.out.println("floor����ȡ��:"+Math.floor(13.46));
		System.out.println("floor����ȡ��:"+Math.floor(13.86));
		System.out.println("-----------------");
		System.out.println("Max����ֵ��"+Math.max(13, 12));
		System.out.println("-----------------");
		System.out.println("powȡa��b����:"+Math.pow(2, 3));
		System.out.println("-----------------");
		System.out.println("random�������0.0-1.0��:"+(int)(Math.random()*10));
		System.out.println("-----------------");
		System.out.println("sqrt��ƽ����"+Math.sqrt(9));
	}
}
