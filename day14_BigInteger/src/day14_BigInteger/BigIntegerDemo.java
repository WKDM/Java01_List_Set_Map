package day14_BigInteger;

import java.sql.Date;

public class BigIntegerDemo {
	/*
	 * Date():��ʾ�ض���˲�䣬��ȷ������
	 * ���췽����
	 * 		Date():���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
	 * 		Date(long date):���ݸ����ĺ���ֵ�������ڶ���
	 * 
	 * */
	public static void main(String[] args) {
		Date date = new Date(0);
		System.out.println("date:"+date);
		long time = date.getTime();
		System.out.println(time);
	}

}
