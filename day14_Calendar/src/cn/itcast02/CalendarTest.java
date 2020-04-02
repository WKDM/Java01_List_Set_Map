package cn.itcast02;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
/*
 * 获取任意年份的二月
 *A：键盘录入任意的年份
 *B:设置日历的年月日
 *		年就是A的输出数据
 *		月是2
 *		日是1
 *C：把时间往前推一天，就是2月的最后一天
 *D：输出这一天即可
 * * 
  * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,2,1);
		calendar.add(Calendar.DATE,-1);	
		System.out.println(year+"年的二月有："+calendar.get(Calendar.DATE));
	}

}
