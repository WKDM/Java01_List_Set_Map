package cn.cast07;
/*
 * ���󣺰������е����ݰ���ָ����ʽƴ��һ���ַ���
 * ������int[] arr = {1,2,3};
 * ��������"[1�� 2�� 3]"
 * ������A������һ���ַ�������
 * 		B���Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ������
 * 		D�����жϸ�Ԫ���Ƿ�Ϊ���һ��Ԫ��
 * 			�ǣ���ƴ��"]"
 * 			���ǣ���ƴ��" "
 * 		E:��ӡ�ַ���
 * 
 * 
 * �Ѵ���ʹ�ù���ʵ�֣�
 * ������ȷ��
 * 	A������ֵ���ͣ�String
 * 	B�������б�int[] arr
 * */

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		int[] arr = {50,13,15,55,60,84};
		
		//����һ���ַ������ͽ��н���
		String string = StringToArray(arr);
		System.out.println(string);
	}
	
	public static String StringToArray(int[] arr){
		String s = "";
		//��ƴ��һ��"["
		s +="[";
		//��������ĵ�ÿһ��Ԫ��
		for(int i=0;i<arr.length;i++){
			if(i == arr.length-1){
				s = s + arr[i]+ "]";
			}else{
				s = s + arr[i] + ", ";
			}			
		}		
		return s;
	}

}
