package cn.itcast01;

import java.util.Calendar;
//public int get(int field){} ���ظ����ֶε�ֵ���������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա����������int����
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int day = rightNow.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+day+"��");
	}

}
