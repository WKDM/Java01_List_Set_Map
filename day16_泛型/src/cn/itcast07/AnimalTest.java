package cn.itcast07;

import java.util.ArrayList;
import java.util.Collection;

public class AnimalTest {
	public static void main(String[] args) {
		Collection<Object> c2 = new ArrayList<Object>();
		Collection<?> c1 = new ArrayList<Object>();
	}
}

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}
