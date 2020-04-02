package cn.itcast04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * aababcabcdabcde  获取字符串中每一个字母出现的次数要求结果：
 * a(5);b(4);c(3);d(2);e(1)
 * 
 * 定义一个字符串（可以改为键盘录入）
 * 定义一个TreeMap集合
 * 		Character:
 * 		Integer:
 * 把字符串转化为字符数组
 * 遍历字符数组，得到每一个字符
 * 拿刚才得到的字符串作为键到集合中去找值，看返回值
 * 		是null，就说明不存在，就把字符作为键，1作为值添加到集合中
 * 		不是null，就说明存在，就把值+1
 * 定义字符串缓冲区变量，得到键和值，进行按照要求拼接
 * 把字符串缓冲区转化为字符串输出
 * */
public class TreeMapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		定义一个字符串（可以改为键盘录入）
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个字符：");
		String line = sc.nextLine();
		
//		定义一个TreeMap集合
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
//		把字符串转化为字符数组
		char[] chs = line.toCharArray();
//		遍历字符数组，得到每一个字符
		for(char ch:chs){			
			Integer i = tm.get(ch);
//			拿刚才得到的字符串作为键到集合中去找值，看返回值
			if(i==null){
//				是null，就说明不存在，就把字符作为键，1作为值添加到集合中
				tm.put(ch, 1);
			}else{
//				不是null，就说明存在，就把值+1
				i++;
				tm.put(ch, i);
			}			
		}
		StringBuilder sb =new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character key:set){
			Integer value = tm.get(key);
			sb.append(key).append("{").append(value).append("}");			
		}
//		把字符串缓冲区转化为字符串输出
		String result = sb.toString();
		System.out.println("result:"+result);
	}

}
