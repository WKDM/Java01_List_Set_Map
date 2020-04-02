package cn.itcast02;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
//		yyyy-MM-dd HH:mm:ss
		String s = DateUtil.dateToString(date, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		String ss = "2014-10-14";
		Date dd = DateUtil.stringToDate(ss, "yyyy-MM-dd");
		System.out.println(dd);
	}

}
