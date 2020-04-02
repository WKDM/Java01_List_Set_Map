package cn.itcast.dao.Impl;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.omg.CORBA.PRIVATE_MEMBER;

import cn.itcast.POJO.User;
import cn.itcast.dao.UserDao;
/**
 * 这是用户操作的实现类
 * */
public class UserDaoImpl implements UserDao {
//为了让多个方法能够使用同一个集合，就把集合定义为成员变量。
	//为了不让外界看到，就是用private
	
	private static ArrayList<User> array = new ArrayList<User>();
	public boolean isLogin(String username, String password) {
		//遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
		boolean flag = false;
		for(User u:array){
			if((u.getUsername().equals(username))&&(u.getPassword().equals(password))){
				flag = true;
			}
		}
		return flag;
	}
	
	public void registe(User user){
		//把用户信息存储集合中
//		ArrayList<User> array = new ArrayList<User>();
		array.add(user);	
	}
}
