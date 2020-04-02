package cn.cast02;

public class ArrayDemo {

	public static void main(String[] args) {
		//定义数组
		int[] arr = {24,69,80,57,14,13};
		System.out.print("排序前：");
		printArray(arr);
		
//		//第一次
//		int x=0;
//		for(int y=x+1;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp;
//				temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//			}
//		}
//		System.out.print("第一次排序后：");
//		printArray(arr);
//		
//		//第二次
//		x=1;
//		for(int y=x+2;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp;
//				temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//			}
//		}
//		System.out.print("第二次排序后：");
//		printArray(arr);
//		
//		//第二次
//		x=2;
//		for(int y=x+3;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp;
//				temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//			}
//		}
//		System.out.print("第三次排序后：");
//		printArray(arr);
//		//最后排序
//		for(int x=0;x<arr.length-1;x++){
//			for(int y=x+1;y<arr.length;y++){
//				if(arr[y]<arr[x]){
//					int temp=arr[x];
//					arr[x]=arr[y];
//					arr[y]=temp;
//				}
//			}
//		}
//		System.out.print("排序后：");
//		printArray(arr);
		
		selectSort(arr);
		System.out.print("排序后：");
		printArray(arr);
	}
	//选择排序
	public static void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<arr[x]){
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}
	
	
	
	//遍历数组
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
