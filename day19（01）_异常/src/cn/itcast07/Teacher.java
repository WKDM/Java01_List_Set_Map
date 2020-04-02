package cn.itcast07;

public class Teacher {
	public void check(int score) throws MyException{
		if(score<0 || score>100){
			throw new MyException("分数区间为1-100");
		}else{
			System.out.println("分数没有问题");
		}
	}
	
	
//	public void check(int score){
//		if(score<0 && score>100){
//			throw new MyException();
//		}else{
//			System.out.println("分数没有问题");
//		}
//	}
}
