package cn.cast03;

public class ArrayTest {
	//字符串的排序：
	//字符串：dsagrf
	
	//分析：
	//定义一个字符串
	//把字符串转成数组
	//进行排序
	//在数组转成字符串
	public static void main(String[] args) {
		String str = "dsagrf";
		char[] ch = str.toCharArray();
		System.out.println("排序前："+str);
		bubbltSort(ch);
		String str1 = String.valueOf(ch);
		System.out.println("排序后："+str1);
	}

	public static void bubbltSort(char[] ch) {
		for(int x = 0;x<ch.length-1;x++){
			for(int y=0;y<ch.length-1-x;y++){
				if(ch[y]>ch[y+1]){
					char temp = ch[y];
					ch[y] =ch[y+1];
					ch[y+1] =temp;
				}
			}
		}
		
	}

}
