package cn.itcast01;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hello");
		hs.add("Java");
		hs.add("world");
		
		for(String e:hs){
			System.out.println(e);
		}
	}
}
