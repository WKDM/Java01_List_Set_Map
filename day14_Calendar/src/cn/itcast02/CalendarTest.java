package cn.itcast02;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
/*
 * ��ȡ������ݵĶ���
 *A������¼����������
 *B:����������������
 *		�����A���������
 *		����2
 *		����1
 *C����ʱ����ǰ��һ�죬����2�µ����һ��
 *D�������һ�켴��
 * * 
  * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.set(year,2,1);
		calendar.add(Calendar.DATE,-1);	
		System.out.println(year+"��Ķ����У�"+calendar.get(Calendar.DATE));
	}

}
