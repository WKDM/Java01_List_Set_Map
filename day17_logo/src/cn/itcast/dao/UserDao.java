package cn.itcast.dao;

import cn.itcast.POJO.User;

/**
 * ��������û����в����Ľӿ�
 * @author Host
 * @version v1.0
 * */
public interface UserDao {
	/**
	 * �����û���¼��¼����
	 * @param username �û���
	 * @param password ����
	 * @return ���ص�¼�Ƿ�ɹ�
	 * */
	public abstract boolean isLogin(String username,String password);
	/**
	 * ����ע�Ṧ��
	 * @param user Ҫע���û�����Ϣ 
	 * */
	public abstract void registe(User user);
}
