package cn.itcast02;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * public static void arraycopy(object src,int srcPos,objest dest,int desPos,int length)
 * */
public class SystemTest03 {
	public static void main(String[] args) {
		int[] arr1 = {11,22,33,44,55};
		int[] arr2 = {6,7,8,9,10};
		System.arraycopy(arr1,1,arr2,2,3);
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("arr2:"+Arrays.toString(arr2));
	}
}
