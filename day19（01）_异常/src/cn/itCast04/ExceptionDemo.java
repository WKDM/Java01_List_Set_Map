package cn.itCast04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("今天的天气很好");
		try {
			method();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("出错了");
		}
		System.out.println("我想出去看看外面的世界");
	}

	private static void method() throws ParseException{
		// TODO Auto-generated method stub
		String s ="2020-03-05";
		SimpleDateFormat spf1=new SimpleDateFormat("yyyy/mm/dd");
		SimpleDateFormat spf=new SimpleDateFormat("yyyy-mm-dd");
		Date date=spf1.parse(s);
		Date date1=spf.parse(s);
		System.out.println(date);
		System.out.println(date1);
	}

}
