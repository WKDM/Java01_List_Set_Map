package cn.itcast.dao.Impl;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

import cn.itcast.POJO.User;
import cn.itcast.dao.UserDao;
/**
 * �����û�������ʵ����
 * */
public class UserDaoImpl implements UserDao {
//Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��ͰѼ��϶���Ϊ��Ա������
	//Ϊ�˲�����翴����������private
	
	private static ArrayList<User> array = new ArrayList<User>();
	public boolean isLogin(String username, String password) {
		//�������ϣ���ȡÿһ���û������жϸ��û����û����������Ƿ�ʹ��ݹ�����ƥ��
		boolean flag = false;
		for(User u:array){
			if((u.getUsername().equals(username))&&(u.getPassword().equals(password))){
				flag = true;
			}
		}
		return flag;
	}
	
	public void registe(User user){
		//���û���Ϣ�洢������
//		ArrayList<User> array = new ArrayList<User>();
		array.add(user);	
	}
}
