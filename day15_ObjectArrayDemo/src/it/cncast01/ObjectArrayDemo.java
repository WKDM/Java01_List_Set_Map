package it.cncast01;

public class ObjectArrayDemo {
	/*
	 * 我有5个学生，请把这5为学生的信息存储在数组中，并遍历数组，获取得到每一位同学的信息
	 * 学生：Student
	 * 成员变量：name,age
	 * 构造方法：无参，有参
	 * 成员方法：getXxx(),setXxx()
	 * 
	 * 分析：
	 * A:创建学生类
	 * B:创建学生数组（对象数组）
	 * C:创建5个学生对象，并复制
	 * D:把C中的元素放入数组
	 * E:遍历学生数组
	 * */
	public static void main(String[] args) {
		//创建一个学生数组
		Student[] students = new Student[5];
		
		//创建5个学生对象，并赋值
		Student s1 =new Student("林青霞",28);
		Student s2 =new Student("赵雅芝",30);
		Student s3 =new Student("王可",28);
		Student s4 =new Student("罗家峪",23);
		Student s5 =new Student("清扬",26);
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
