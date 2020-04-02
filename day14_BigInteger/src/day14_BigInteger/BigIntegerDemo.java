package day14_BigInteger;

import java.sql.Date;

public class BigIntegerDemo {
	/*
	 * Date():表示特定的瞬间，精确到毫秒
	 * 构造方法：
	 * 		Date():根据当前的默认毫秒值创建日期对象
	 * 		Date(long date):根据给定的毫秒值创建日期对象
	 * 
	 * */
	public static void main(String[] args) {
		Date date = new Date(0);
		System.out.println("date:"+date);
		long time = date.getTime();
		System.out.println(time);
	}

}
