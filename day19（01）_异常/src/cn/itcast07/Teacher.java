package cn.itcast07;

public class Teacher {
	public void check(int score) throws MyException{
		if(score<0 || score>100){
			throw new MyException("��������Ϊ1-100");
		}else{
			System.out.println("����û������");
		}
	}
	
	
//	public void check(int score){
//		if(score<0 && score>100){
//			throw new MyException();
//		}else{
//			System.out.println("����û������");
//		}
//	}
}
