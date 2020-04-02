package cn.cast01;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * 数组排序：冒泡排序
 * 相邻元素两两比较，大的往后放，第一次完毕后，
 * 最大值就出现在了最大的索引处，同理即可得到一个排好序的数组。
 * */
public class ArrayDemo {

	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};		
		System.out.print("排序前：");
		printArray(arr);		
		bubbleSort(arr);				
		System.out.print("排序后：");
		printArray(arr);
	}
	//冒泡排序
	public static void bubbleSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-1-x;y++){
				int temp;
				if(arr[y]>arr[y+1]){
					temp = arr[y];
					arr[y] =arr[y+1];
					arr[y+1] = temp;
				}
			}
		}				
	}
	
	
	//遍历数组
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("]");
	}
}
