package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;

public class ForDemo {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("==============");
		//增强for
		for(int x:arr){
			System.out.println(x);
		}
		System.out.println("==============");
		String[] strings ={"杨过","郭靖","黄蓉","小龙女"};
		for(String str:strings){
			System.out.println(str);
		}
		System.out.println("==============");
		Collection<String> c1 = new ArrayList<String>();
		c1.add("Hello");
		c1.add("world");
		c1.add("java");
		for(String x:c1){
			System.out.println(x);
		}
	}

}
