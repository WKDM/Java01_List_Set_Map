package it.cncast01;

public class ObjectArrayDemo {
	/*
	 * ����5��ѧ���������5Ϊѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһλͬѧ����Ϣ
	 * ѧ����Student
	 * ��Ա������name,age
	 * ���췽�����޲Σ��в�
	 * ��Ա������getXxx(),setXxx()
	 * 
	 * ������
	 * A:����ѧ����
	 * B:����ѧ�����飨�������飩
	 * C:����5��ѧ�����󣬲�����
	 * D:��C�е�Ԫ�ط�������
	 * E:����ѧ������
	 * */
	public static void main(String[] args) {
		//����һ��ѧ������
		Student[] students = new Student[5];
		
		//����5��ѧ�����󣬲���ֵ
		Student s1 =new Student("����ϼ",28);
		Student s2 =new Student("����֥",30);
		Student s3 =new Student("����",28);
		Student s4 =new Student("�޼���",23);
		Student s5 =new Student("����",26);
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		for(int i=0;i<students.length;i++){
			Student ss = students[i];
			System.out.println(ss.getName()+"========"+ss.getAge());
		}
	}
}
