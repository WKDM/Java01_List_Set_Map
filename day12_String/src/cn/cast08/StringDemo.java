package cn.cast08;
/*
 * ͳ��С���ڴ��г��ֵĴ�����
 * ��woaijavawozhenaijavawozhendeaijavawozhendeaijavanixinmagun��
 * �ж�java���ֵĴ���
 * ˼·��
 * A������һ��ͳ�Ʊ�������ʼ��ֵ��0
 * B:�Ȼ�ȡһ�Ρ�java����������е�һ�γ��ֵ�����
 * 	�������-1��˵��������
 * 	�������ֵ����-1����˵�����ڣ�ͳ�Ʊ���++
 * C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡԭʼ�󴮣��õ�һ���µ��ַ��������Ѹ��ַ��������¸�ֵ����
 * D:�ص�B
 * */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String maxstr = "woaijavawozhenaijavawozhendeaijavawozhendeaijavanixinmagun";
		String minstr = "java";
		
		//����ʵ��
		int count = getCount(maxstr, minstr);
		 System.out.println("����С���г��ֵĴ�����"+ count);
	}
	
//	������ȷ��
//		A:����ֵ���ͣ�int
//		B:�����б�String maxstr,String minstr
	public static int getCount(String maxstr,String minstr){
		//����һ��ͳ�Ʊ�������ʼֵΪ0
		int count = 0;
		//���ڴ��в���һ��С����λ�� 
		int index = maxstr.indexOf(minstr);
		//�ж�����ֵ�Ƿ�Ϊ-1
		while(index !=-1){
			count++;
			//�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡԭʼ�󴮣��õ�һ���µ��ַ���
			int startIndex = index + minstr.length();
			maxstr = maxstr.substring(startIndex);
//			�ظ�����
			index = maxstr.indexOf(minstr);
		}
		return count;
	}

}
