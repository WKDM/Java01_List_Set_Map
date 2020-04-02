package cn.itcast02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo04 {

	public static void main(String[] args) {
		HashMap<Student,String> hm = new HashMap<Student,String>();
		Student s1 = new Student("王明",23);
		Student s2 = new Student("马伟",25);
		Student s3 = new Student("方超",27);
		Student s4 = new Student("明星",29);
		Student s5 = new Student("云华",28);
		Student s6 = new Student("王明",23);
		hm.put(s1, "001");
		hm.put(s2, "002");
		hm.put(s3, "003");
		hm.put(s4, "004");
		hm.put(s5, "005");
		Set<Student> set =hm.keySet();
		for(Student key:set){
			String value = hm.get(key);
			System.out.println(key.getName()+"----"+key.getAge()+"----"+value);
		}
	}

}
