package cn.itcast02;

import java.util.HashMap;
import java.util.Set;
//HashMap<String,student>
//����String
//ֵ��Student
public class HashMapDemo03 {

	public static void main(String[] args) {
		HashMap<String,Student> hm = new HashMap<String,Student>();
		Student s1 = new Student("����",23);
		Student s2 = new Student("��ΰ",25);
		Student s3 = new Student("����",27);
		Student s4 = new Student("����",29);
		Student s5 = new Student("�ƻ�",28);
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
