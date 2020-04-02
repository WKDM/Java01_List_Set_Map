package cn.cast08;
/*
 * 统计小船在大串中出现的次数：
 * “woaijavawozhenaijavawozhendeaijavawozhendeaijavanixinmagun”
 * 判断java出现的次数
 * 思路：
 * A：定义一个统计变量，初始化值是0
 * B:先获取一次“java”在这个大串中第一次出现的索引
 * 	如果返回-1就说明不存在
 * 	如果索引值不是-1，就说明存在，统计变量++
 * C:把刚才的索引+小船的长度最为起始位置截取原始大串，得到一个新的字符串，并把该字符串的重新赋值给大串
 * D:回到B
 * */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String maxstr = "woaijavawozhenaijavawozhendeaijavawozhendeaijavanixinmagun";
		String minstr = "java";
		
		//功能实现
		int count = getCount(maxstr, minstr);
		 System.out.println("大串在小串中出现的次数是"+ count);
	}
	
//	两个明确：
//		A:返回值类型：int
//		B:参数列表：String maxstr,String minstr
	public static int getCount(String maxstr,String minstr){
		//定义一个统计变量，初始值为0
		int count = 0;
		//现在大串中查找一次小串的位置 
		int index = maxstr.indexOf(minstr);
		//判断索引值是否为-1
		while(index !=-1){
			count++;
			//把刚才的索引+小船的长度最为起始位置截取原始大串，得到一个新的字符串
			int startIndex = index + minstr.length();
			maxstr = maxstr.substring(startIndex);
//			重复查找
			index = maxstr.indexOf(minstr);
		}
		return count;
	}

}
