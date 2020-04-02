package cn.itcast02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		Student s1 = new Student("李华",23,"男");
		Student s2 = new Student("王芳",24,"女");
		Student s3 = new Student("小李",28,"男");
		Student s4 = new Student("小明",23,"女");
		Student s5 = new Student("王云",21,"男");
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		//遍历
		Iterator<Student> it = array.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			System.out.println(stu);
		}
	}

}
