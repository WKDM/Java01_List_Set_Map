package cn.cast07;

import java.lang.reflect.Array;

/*
 * 需求：把数组中的数据按照指定格式拼接一个字符串
 * 举例：int[] arr = {1,2,3};
 * 输出结果："[1， 2， 3]"
 * 分析：A：定义一个字符串对象
 * 		B：先把字符串拼接一个"["
 * 		C:遍历int数组，得到每一个数据
 * 		D：先判断钙元素是否为最后一个元素
 * 			是：就拼接"]"
 * 			不是：就拼接" "
 * 		E:打印字符串
 * */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,13,15,55,60,84};
//		定义一个字符串
		String s = "";
		//先拼接一个"["
		s +="[";
		//遍历数组的到每一个元素
		for(int i=0;i<arr.length;i++){
			if(i == arr.length-1){
				s = s + arr[i]+ "]";
			}else{
				s = s + arr[i] + ", ";
			}			
		}
		System.out.println(s);
	}

}
