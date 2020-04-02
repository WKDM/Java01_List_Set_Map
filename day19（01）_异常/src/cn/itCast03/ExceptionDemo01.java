package cn.itCast03;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class ExceptionDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2019-12-13";
		SimpleDateFormat spf = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date d = spf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {			
//			e.printStackTrace();
			System.out.println("解析日期出现问题");
		}
	}

}
