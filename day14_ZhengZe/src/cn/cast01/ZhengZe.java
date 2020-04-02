package cn.cast01;

import java.util.Scanner;

/*
 * 校验QQ号：
 * 	要求必须是5-15喂数字
 * 	0不能开头
 * 
 * 分析：
 * 		键入一个qq号码
 * 		写一个功能实践校验
 * 		调用功能入出结果
 * */
public class ZhengZe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您的qq号:");
		String qq = sc.nextLine();	
		
		System.out.println("qq号："+ checkQQ(qq));
	}
	/*
	 * 实现一个功能：
	 * 		两个明确：
	 * 			明确返回值类型
	 * 			明确参数列表
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
