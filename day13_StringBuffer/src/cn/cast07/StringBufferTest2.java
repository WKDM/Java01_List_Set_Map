package cn.cast07;
/*
 * 做字符串的拼接功能
 * */
public class StringBufferTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {44,55,33,22,66};	
		
		
		//功能实现
		//Sting方法实现
		String array = arrayToString1(arr);
		System.out.println(array);
		
		
		
		//StringBuffer方法实现
		String array2 = arrayToString2(arr);
		System.out.println(array2);
	}
	//String功能函数
	public static String arrayToString1(int[] arr){
		String s = "";
		s += "[";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				s= s+arr[i]+"]";
			}else{
				s = s+arr[i]+", ";
			}
		}
		return s;
	}
	
	//StringBuffer功能函数
	public static String arrayToString2(int[] arr){
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				sBuffer.append(arr[i]);
			}else{
				sBuffer.append(arr[i]).append(", ");
			}
		}
		sBuffer.append("]");
		return sBuffer.toString();
	}

}
