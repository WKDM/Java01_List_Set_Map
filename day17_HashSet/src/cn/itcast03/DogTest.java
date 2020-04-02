package cn.itcast03;

import java.util.HashSet;

public class DogTest {
	public static void main(String[] args) {
		HashSet<Dog> hSet = new HashSet<Dog>();
		Dog dog1 = new Dog("小花","blue",2,"公");
		Dog dog2 = new Dog("小毛","red",2,"公");
		Dog dog3 = new Dog("小到","blue",2,"公");
		Dog dog4 = new Dog("小相机","blue",2,"公");
		Dog dog5 = new Dog("小客户","blue",2,"公");
		Dog dog6 = new Dog("小花","blue",2,"公");
		hSet.add(dog1);
		hSet.add(dog2);
		hSet.add(dog3);
		hSet.add(dog4);
		hSet.add(dog5);
		hSet.add(dog6);
		
		for(Dog dog:hSet){
			System.out.println(dog);
		}
	}
}
