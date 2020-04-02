package cn.cast03;

import java.util.Scanner;

public class StringTest {
	/*
	 * 模拟登陆：三次输入的机会
	 * 分析：
	 * 	1.定义用户名和密码
	 * 	2.键盘输入用户名和密码
	 * 	3.用输入的用户名进行比较
	 * 	4.用for循环进行控制次数*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//定义用户名和密码
		String userName = "admin";
		String psd = "admin";		
		Scanner sc = new Scanner(System.in);
		
		//进行for循环控制次数
		for(int i = 0;i < 3;i++){
			//i=0,1,2
			
			//键盘输入用户名和密码
			System.out.println("请输入用户名：");
			String user = sc.nextLine();
			System.out.println("请输入密码：");
			String psw = sc.nextLine();
			if(user.equals(userName) && psw.equals(psd)){
				System.out.println("登录成功");
				break;
			}else{
				System.out.println("登录失败，请重新输入");
				if((2-i)==0){
					System.out.println("账户被锁定，请联系官方");
				}else{
					System.out.println("您还有"+(2-i)+"次登录机会");
				}
			}
		}
	}

}
