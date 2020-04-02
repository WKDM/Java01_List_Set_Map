package cn.itcast02;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * �����������ַ����໥ת���Ĺ�����
 * */
public class DateUtil {
	private DateUtil(){}
	/**
	 * @param date ��ת�������ڶ���
	 * @param format ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @return ��ʽ�����ַ���
	 * */
	public static String dateToString(Date date,String format){
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		return sdf.format(date);
		return new SimpleDateFormat(format).format(date);
	}
	/**
	 * @param str ��ת�������ڶ���
	 * @param format ���ݹ�����Ҫ��ת���ĸ�ʽ
	 * @return ��ʽ����ʱ��
	 * @throws ParseException 
	 * */
	public static Date stringToDate(String str,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(str);
	}
}
