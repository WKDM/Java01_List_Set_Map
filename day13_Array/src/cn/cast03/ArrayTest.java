package cn.cast03;

public class ArrayTest {
	//�ַ���������
	//�ַ�����dsagrf
	
	//������
	//����һ���ַ���
	//���ַ���ת������
	//��������
	//������ת���ַ���
	public static void main(String[] args) {
		String str = "dsagrf";
		char[] ch = str.toCharArray();
		System.out.println("����ǰ��"+str);
		bubbltSort(ch);
		String str1 = String.valueOf(ch);
		System.out.println("�����"+str1);
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
