package cn.cast02;

public class ArrayDemo {

	public static void main(String[] args) {
		//��������
		int[] arr = {24,69,80,57,14,13};
		System.out.print("����ǰ��");
		printArray(arr);
		
//		//��һ��
//		int x=0;
//		for(int y=x+1;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp;
//				temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//			}
//		}
//		System.out.print("��һ�������");
//		printArray(arr);
//		
//		//�ڶ���
//		x=1;
//		for(int y=x+2;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp;
//				temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//			}
//		}
//		System.out.print("�ڶ��������");
//		printArray(arr);
//		
//		//�ڶ���
//		x=2;
//		for(int y=x+3;y<arr.length;y++){
//			if(arr[y]<arr[x]){
//				int temp;
//				temp = arr[x];
//				arr[x] = arr[y];
//				arr[y] = temp;
//			}
//		}
//		System.out.print("�����������");
//		printArray(arr);
//		//�������
//		for(int x=0;x<arr.length-1;x++){
//			for(int y=x+1;y<arr.length;y++){
//				if(arr[y]<arr[x]){
//					int temp=arr[x];
//					arr[x]=arr[y];
//					arr[y]=temp;
//				}
//			}
//		}
//		System.out.print("�����");
//		printArray(arr);
		
		selectSort(arr);
		System.out.print("�����");
		printArray(arr);
	}
	//ѡ������
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
	
	
	
	//��������
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
