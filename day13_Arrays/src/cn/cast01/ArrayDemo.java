package cn.cast01;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * public static String toString(int[] arr)把数组转换成字符串
 * public static void Sort(int[] a)给字符串进行排序
 * public static int binarySearch(int[] a,int key)二分查找
 * */
public class ArrayDemo {

	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};
		//把数组转化为字符串
		System.out.println("排序前："+Arrays.toString(arr));
		//给字符串进行排序
		Arrays.sort(arr);
		System.out.println("排序后："+Arrays.toString(arr));
		//二分查找 
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 57));
	}

}
