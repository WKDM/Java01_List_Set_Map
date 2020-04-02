package cn.itcast01;

import java.util.Calendar;
//public int get(int field){} 返回给定字段的值，日历类中的每个日历字段都是静态的成员变量并且是int类型
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int day = rightNow.get(Calendar.DATE);
		System.out.println(year+"年"+month+"月"+day+"日");
	}

}
