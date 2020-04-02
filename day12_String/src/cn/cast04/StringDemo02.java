package cn.cast04;
/*
 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
 * 举例:"Hello123World"
 * 结果：
 * 		大写字符：2个；
 * 		小写字符：8个；
 * 		数字字符：3个
 * 分析：
 * 		A:定义三个统计变量
 * 			bigCount = 0
 * 			smallCount = 0
 * 			numberCount = 0
 * 		B:遍历字符串，得到每一个字符
 * 			length()和charAt()
 * 		C:判断该字符到底是属于那种类型的
 * 			大：bigCount++
 * 			小：smallCout++
 * 			数字：numberCount++
 * 		难点：怎么判断某个字符串是大的，还是小的，还是数字的
 * 			ASCII码表：
 * 				0:48
 * 				A:65
 * 				a:97
 * 			虽然，我们按照数字的这种 比较是可以的
 * 				char ch = s.charAt(x);
 * 				if(ch >= '0' && ch <= '9') numberCount ++
 * 				if(ch >= 'a' && ch <= 'x') smallCount ++
 * 				if(ch >= 'A' && ch <= 'X')	bigCount ++
 * 		D:输出结果
 * */
public class StringDemo02 {
	public static void main(String[] args) {
		String  str = "Hello123World";
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//遍历字符串
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9'){
				numberCount ++ ;
			}else if(ch >= 'a' && ch <= 'x'){
				smallCount ++;
			}else if(ch>='A' && ch <='X'){
				bigCount ++;
			}
		}
		System.out.println("大写字母个数："+bigCount+";\n小写字母个数："+smallCount+";\n数字个数："+numberCount);
	}
}
