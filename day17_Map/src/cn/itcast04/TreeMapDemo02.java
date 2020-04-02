package cn.itcast04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				//主要条件
				int num=s1.getAge()-s2.getAge();
				//次要条件
				int num2 = num==0?s1.getAge():s2.getAge();
				return num2;
			}
		});
		Student s1 = new Student("尔康",23);
		Student s2 = new Student("紫薇",25);
		Student s3 = new Student("小燕子",26);
		Student s4 = new Student("五阿哥",27);
		Student s5 = new Student("斑鸠",28);
		
		tm.put(s1,"001");
		tm.put(s2,"002");
		tm.put(s3,"003");
		tm.put(s4,"004");
		tm.put(s5,"005");
		
		Set<Student> set =tm.keySet();
		for(Student key:set){
			String value = tm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"-----"+value);
		}
	}

}
