package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

//ӵ���ʹ���5��ѧ�����󣬲�����
//������
//A������ѧ����
//B:�������϶���
//C:����ѧ������
//D:��ѧ����ӵ����ϵ���
//E:�Ѽ���תΪ����
//D:��������
class Student{
	private String name;
	private int age;
	private String sex;
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
public class CollextionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		Student s1=new Student("����",25,"��");
		Student s2=new Student("����",29,"��");
		Student s3=new Student("����",25,"Ů");
		Student s4=new Student("��զ��",13,"Ů");
		Student s5=new Student();
		s5.setName("����");
		s5.setAge(26);
		s5.setSex("��");
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Object[] o = c.toArray();
		
		for(int i=0;i<o.length;i++){
			Student s = (Student) o[i];
			System.out.println("������"+s.getName()+",���䣺"+s.getAge()+",�Ա�"+s.getSex());
		}
	}

}
