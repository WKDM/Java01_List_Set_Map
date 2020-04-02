package cn.itcast02;

import java.util.HashSet;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs =new HashSet<Student>();
		Student stu1 = new Student("林青霞",21);
		Student stu2 = new Student("王祖贤",23);
		Student stu3 = new Student("柳岩",22);
		Student stu4 = new Student("林青霞",21);
		Student stu5 = new Student("谎言",21);
		
		
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		hs.add(stu5);
		
		
		for(Student stu:hs){
			System.out.println("姓名："+stu.getName()+",年龄"+stu.getAge());
		}
	}

}
