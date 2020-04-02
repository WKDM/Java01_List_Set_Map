package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.POJO.User;
import cn.itcast.dao.UserDao;
import cn.itcast.dao.Impl.UserDaoImpl;

/**
 * 用户测试类
 * @author Host
 * @version v1.0
 * */
public class UserTest {

	public static void main(String[] args) {
		while(true){
			System.out.println("-------欢迎光临-------");
			System.out.println("1.登录");
			System.out.println("2.注册");
			System.out.println("3.退出");
			System.out.println("--------------------");
			System.out.println("请输入您的选择：");
			Scanner sc = new Scanner(System.in);		
			String ChioscStr = sc.nextLine();
			//多个地方使用，就定义到外面
			UserDaoImpl ud = new UserDaoImpl();
			switch (ChioscStr) {
				case "1":
					System.out.println("------登陆界面--------");
					System.out.println("请输入用户名：");
					String username = sc.nextLine();
					System.out.println("请输入密码：");
					String password = sc.nextLine();
					boolean flag = ud.isLogin(username, password);
					if(flag){
						System.out.println("登陆成功");
						System.exit(0);
						//break;//这里是退出的switch
					}else{
						System.out.println("用户名或者密码错误，登陆失败");
					}			
					break;
				case "2":
					System.out.println("------注册界面--------");
					System.out.println("请输入用户名：");
					String newUsername = sc.nextLine();
					System.out.println("请输入密码：");
					String newPassword = sc.nextLine();
			
					//把用户名和密码封装到对象中
					User user = new User();
					user.setUsername(newUsername);
					user.setPassword(newPassword);
					//调用注册方法
					//多态
//					UserDao ud = new UserDaoImpl();
//					UserDaoImpl udi = new UserDaoImpl();
					ud.registe(user);
					System.out.println("注册成功");
					break;
				case "3":
				default:
					System.out.println("谢谢使用，欢迎下次再来");
					System.exit(0);
					break;
			}
		}
	}
}
