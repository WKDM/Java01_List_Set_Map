package cn.itcast03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListTest {
	/*
	 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
	 * 分析：
	 * 		A:创建键盘录入数据对象
	 * 		B:键盘录入多个数据，我们暂时不知道多少个所以使用集合
	 * 		C:如果输入的数据为0，则就结束
	 * 		D:把集合转成数组，
	 * 		E:对数组就行排序
	 * 		F:获取数组中最大的数组值
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> array =new ArrayList<Integer>();
		while(true){
			System.out.println("请输入数据：");
			int num = scn.nextInt();
			if(num!=0){
				array.add(num);				
			}else{
				break;
			}			
		}
		//把数组转化为数组
		Integer[] i = new Integer[array.size()];
//		Integer[] ii =array.toArray(i);
		array.toArray(i);
		Arrays.sort(i);
		System.out.println(i[i.length-1]);
	}
	
}
