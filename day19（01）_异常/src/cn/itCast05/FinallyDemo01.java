package cn.itCast05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyDemo01 {
	public static void main(String[] args) {
		String s ="2019-12-23";
		SimpleDateFormat spf = new SimpleDateFormat("dd-mm-yyyy");
		Date date=null;
		try {
			date =spf.parse(s);
		} catch (Exception e) {
//			e.printStackTrace();
		}finally{
//			System.exit(0);
			System.out.println("��ʲôʱ�򶼿���ִ�У�����JVM��ǰ�˳�");
		}
		System.out.println(date);
	}
}
