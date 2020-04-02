package cn.itcast01;
/*
 * public static void gc(){}
 * public static void exit(int start)
 * public static void arraycopy(object src,int srcPos,objest dest,int desPos,int length)
 * public static long currentTimeMillis()//返回以毫秒为单位的时间
 * */
public class SystemDemo {

	public static void main(String[] args) {
		Person p =new Person("赵雅芝",23);
		System.out.println(p);
		p = null;
		System.gc();
		
	}

}
