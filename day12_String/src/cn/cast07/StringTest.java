package cn.cast07;

import java.lang.reflect.Array;

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
 * */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,13,15,55,60,84};
//		����һ���ַ���
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
		System.out.println(s);
	}

}
