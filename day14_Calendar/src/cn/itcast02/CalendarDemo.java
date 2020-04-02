package cn.itcast02;

import java.util.Calendar;

/*
 * public void add(int field,int amount){}据给定的时间，对当前的时间进行操作
 * public final void set(int year,int month,int date)设置当前的年月日
 * */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println("今天是："+year+"年"+month+"月"+day+"日");
		//三年前
		c.add(Calendar.YEAR, -3);
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH);
		int day1 = c.get(Calendar.DATE);
		System.out.println("今天是："+year1+"年"+month1+"月"+day1+"日");
		
	}

}
