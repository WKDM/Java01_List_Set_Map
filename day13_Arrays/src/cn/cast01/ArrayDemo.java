package cn.cast01;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * public static String toString(int[] arr)������ת�����ַ���
 * public static void Sort(int[] a)���ַ�����������
 * public static int binarySearch(int[] a,int key)���ֲ���
 * */
public class ArrayDemo {

	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		//������ת��Ϊ�ַ���
		System.out.println("����ǰ��"+Arrays.toString(arr));
		//���ַ�����������
		Arrays.sort(arr);
		System.out.println("�����"+Arrays.toString(arr));
		//���ֲ��� 
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 57));
	}

}
