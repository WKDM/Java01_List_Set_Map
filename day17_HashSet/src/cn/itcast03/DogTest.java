package cn.itcast03;

import java.util.HashSet;

public class DogTest {
	public static void main(String[] args) {
		HashSet<Dog> hSet = new HashSet<Dog>();
		Dog dog1 = new Dog("С��","blue",2,"��");
		Dog dog2 = new Dog("Сë","red",2,"��");
		Dog dog3 = new Dog("С��","blue",2,"��");
		Dog dog4 = new Dog("С���","blue",2,"��");
		Dog dog5 = new Dog("С�ͻ�","blue",2,"��");
		Dog dog6 = new Dog("С��","blue",2,"��");
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
