package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.POJO.User;
import cn.itcast.dao.UserDao;
import cn.itcast.dao.Impl.UserDaoImpl;

/**
 * �û�������
 * @author Host
 * @version v1.0
 * */
public class UserTest {

	public static void main(String[] args) {
		while(true){
			System.out.println("-------��ӭ����-------");
			System.out.println("1.��¼");
			System.out.println("2.ע��");
			System.out.println("3.�˳�");
			System.out.println("--------------------");
			System.out.println("����������ѡ��");
			Scanner sc = new Scanner(System.in);		
			String ChioscStr = sc.nextLine();
			//����ط�ʹ�ã��Ͷ��嵽����
			UserDaoImpl ud = new UserDaoImpl();
			switch (ChioscStr) {
				case "1":
					System.out.println("------��½����--------");
					System.out.println("�������û�����");
					String username = sc.nextLine();
					System.out.println("���������룺");
					String password = sc.nextLine();
					boolean flag = ud.isLogin(username, password);
					if(flag){
						System.out.println("��½�ɹ�");
						System.exit(0);
						//break;//�������˳���switch
					}else{
						System.out.println("�û�������������󣬵�½ʧ��");
					}			
					break;
				case "2":
					System.out.println("------ע�����--------");
					System.out.println("�������û�����");
					String newUsername = sc.nextLine();
					System.out.println("���������룺");
					String newPassword = sc.nextLine();
			
					//���û����������װ��������
					User user = new User();
					user.setUsername(newUsername);
					user.setPassword(newPassword);
					//����ע�᷽��
					//��̬
//					UserDao ud = new UserDaoImpl();
//					UserDaoImpl udi = new UserDaoImpl();
					ud.registe(user);
					System.out.println("ע��ɹ�");
					break;
				case "3":
				default:
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
					break;
			}
		}
	}
}
