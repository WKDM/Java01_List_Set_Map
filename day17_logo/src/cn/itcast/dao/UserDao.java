package cn.itcast.dao;

import cn.itcast.POJO.User;

/**
 * 这是针对用户进行操作的接口
 * @author Host
 * @version v1.0
 * */
public interface UserDao {
	/**
	 * 这是用户登录登录功能
	 * @param username 用户名
	 * @param password 密码
	 * @return 返回登录是否成功
	 * */
	public abstract boolean isLogin(String username,String password);
	/**
	 * 这是注册功能
	 * @param user 要注册用户的信息 
	 * */
	public abstract void registe(User user);
}
