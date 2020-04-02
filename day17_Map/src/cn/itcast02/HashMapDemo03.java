package cn.itcast02;

import java.util.HashMap;
import java.util.Set;
//HashMap<String,student>
//键：String
//值：Student
public class HashMapDemo03 {

	public static void main(String[] args) {
		HashMap<String,Student> hm = new HashMap<String,Student>();
		Student s1 = new Student("王明",23);
		Student s2 = new Student("马伟",25);
		Student s3 = new Student("方超",27);
		Student s4 = new Student("明星",29);
		Student s5 = new Student("云华",28);
		hm.put("001", s1);
		hm.put("002", s2);
		hm.put("003", s3);
		hm.put("004", s4);
		hm.put("005", s5);
		
		Set<String> set=hm.keySet();
		
		for(String key:set){
			Student student=hm.get(key);			
			System.out.println(key+"->name:"+student.getName()+";age:"+student.getAge());
		}
	}

}
