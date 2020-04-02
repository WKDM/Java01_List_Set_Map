package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;

//拥挤和存贮5个学生对象，并遍历
//分析：
//A：创建学生类
//B:创建集合对象
//C:创建学生对象
//D:把学生添加到集合当中
//E:把集合转为数组
//D:遍历数组
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
		Student s1=new Student("王二",25,"男");
		Student s2=new Student("王打",29,"男");
		Student s3=new Student("王花",25,"女");
		Student s4=new Student("呢咋还",13,"女");
		Student s5=new Student();
		s5.setName("张三");
		s5.setAge(26);
		s5.setSex("男");
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Object[] o = c.toArray();
		
		for(int i=0;i<o.length;i++){
			Student s = (Student) o[i];
			System.out.println("姓名："+s.getName()+",年龄："+s.getAge()+",性别："+s.getSex());
		}
	}

}
