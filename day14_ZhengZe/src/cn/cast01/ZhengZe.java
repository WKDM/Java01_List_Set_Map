package cn.cast01;

import java.util.Scanner;

/*
 * У��QQ�ţ�
 * 	Ҫ�������5-15ι����
 * 	0���ܿ�ͷ
 * 
 * ������
 * 		����һ��qq����
 * 		дһ������ʵ��У��
 * 		���ù���������
 * */
public class ZhengZe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������qq��:");
		String qq = sc.nextLine();	
		
		System.out.println("qq�ţ�"+ checkQQ(qq));
	}
	/*
	 * ʵ��һ�����ܣ�
	 * 		������ȷ��
	 * 			��ȷ����ֵ����
	 * 			��ȷ�����б�
	 * */
	public static boolean checkQQ(String qq){
		boolean flag = true;
		if(qq.length()>=5 && qq.length()<=15){
			if(!qq.startsWith("0")){
				char[] ch =qq.toCharArray();
				for(int i=0;i<qq.length()-1;i++){
					if(!Character.isDigit(ch[i])){
						flag = false;
						break;
					}
				}
			}else{
				flag = false;
			}
		}else{
			flag = false;
		}
		return flag;
	}

}
