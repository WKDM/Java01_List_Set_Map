package cn.itcast02;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 这是日期与字符串相互转换的工具类
 * */
public class DateUtil {
	private DateUtil(){}
	/**
	 * @param date 被转换的日期对象
	 * @param format 传递过来的要被转换的格式
	 * @return 格式化的字符串
	 * */
	public static String dateToString(Date date,String format){
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		return sdf.format(date);
		return new SimpleDateFormat(format).format(date);
	}
	/**
	 * @param str 被转换的日期对象
	 * @param format 传递过来的要被转换的格式
	 * @return 格式化的时间
	 * @throws ParseException 
	 * */
	public static Date stringToDate(String str,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(str);
	}
}
