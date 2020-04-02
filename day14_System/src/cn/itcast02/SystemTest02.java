package cn.itcast02;
//public static long currentTimeMillis()//返回以毫秒为单位的时间
public class SystemTest02 {
	public static void main(String[] args) {
		//计算运行共耗时
		long start =System.currentTimeMillis();
		for(int i=0;i<100;i++){
			System.out.println("Hello"+i);
		}
		long end = System.currentTimeMillis();
		System.out.println("总共耗时："+(end-start)+"毫秒");
	}
}
