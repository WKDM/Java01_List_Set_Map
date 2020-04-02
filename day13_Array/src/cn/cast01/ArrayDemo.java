package cn.cast01;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * ��������ð������
 * ����Ԫ�������Ƚϣ��������ţ���һ����Ϻ�
 * ���ֵ�ͳ�������������������ͬ���ɵõ�һ���ź�������顣
 * */
public class ArrayDemo {

	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};		
		System.out.print("����ǰ��");
		printArray(arr);		
		bubbleSort(arr);				
		System.out.print("�����");
		printArray(arr);
	}
	//ð������
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
	
	
	//��������
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
