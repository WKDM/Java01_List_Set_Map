package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Students{
	private String name;
	private int age;
	private String sex;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
public class IteratorTest {
/*
 * �ü��ϴ洢5��ѧ����ʹ�õ��������б���
 * */
	public static void main(String[] args) {
		Students s1=new Students("����",25,"��");
		Students s2=new Students("����",29,"��");
		Students s3=new Students("����",25,"Ů");
		Students s4=new Students("��զ��",13,"Ů");
		Students s5=new Students("������",23,"��");
		
		Collection c1 = new ArrayList();
		c1.add(s1);
		c1.add(s2);
		c1.add(s3);
		c1.add(s4);
		c1.add(s5);
		
		Iterator it = c1.iterator();
		while(it.hasNext()){
			Students students = (Students) it.next();
			System.out.println(students);
		}
		for(it = c1.iterator();it.hasNext();){
			Students students = (Students) it.next();
			System.out.println(students.getName()+"---"+students.getAge()+"----"+students.getSex());
		}
	}

}
