package cn.itcast02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		Student s1 = new Student("�",23,"��");
		Student s2 = new Student("����",24,"Ů");
		Student s3 = new Student("С��",28,"��");
		Student s4 = new Student("С��",23,"Ů");
		Student s5 = new Student("����",21,"��");
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		//����
		Iterator<Student> it = array.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			System.out.println(stu);
		}
	}

}
