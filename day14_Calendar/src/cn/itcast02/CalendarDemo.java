package cn.itcast02;

import java.util.Calendar;

/*
 * public void add(int field,int amount){}�ݸ�����ʱ�䣬�Ե�ǰ��ʱ����в���
 * public final void set(int year,int month,int date)���õ�ǰ��������
 * */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		System.out.println("�����ǣ�"+year+"��"+month+"��"+day+"��");
		//����ǰ
		c.add(Calendar.YEAR, -3);
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH);
		int day1 = c.get(Calendar.DATE);
		System.out.println("�����ǣ�"+year1+"��"+month1+"��"+day1+"��");
		
	}

}
