package cn.cast03;

import java.util.Scanner;

public class StringTest {
	/*
	 * ģ���½����������Ļ���
	 * ������
	 * 	1.�����û���������
	 * 	2.���������û���������
	 * 	3.��������û������бȽ�
	 * 	4.��forѭ�����п��ƴ���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����û���������
		String userName = "admin";
		String psd = "admin";		
		Scanner sc = new Scanner(System.in);
		
		//����forѭ�����ƴ���
		for(int i = 0;i < 3;i++){
			//i=0,1,2
			
			//���������û���������
			System.out.println("�������û�����");
			String user = sc.nextLine();
			System.out.println("���������룺");
			String psw = sc.nextLine();
			if(user.equals(userName) && psw.equals(psd)){
				System.out.println("��¼�ɹ�");
				break;
			}else{
				System.out.println("��¼ʧ�ܣ�����������");
				if((2-i)==0){
					System.out.println("�˻�������������ϵ�ٷ�");
				}else{
					System.out.println("������"+(2-i)+"�ε�¼����");
				}
			}
		}
	}

}
