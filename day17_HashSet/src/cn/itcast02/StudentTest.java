package cn.itcast02;

import java.util.HashSet;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs =new HashSet<Student>();
		Student stu1 = new Student("����ϼ",21);
		Student stu2 = new Student("������",23);
		Student stu3 = new Student("����",22);
		Student stu4 = new Student("����ϼ",21);
		Student stu5 = new Student("����",21);
		
		
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		hs.add(stu5);
		
		
		for(Student stu:hs){
			System.out.println("������"+stu.getName()+",����"+stu.getAge());
		}
	}

}
