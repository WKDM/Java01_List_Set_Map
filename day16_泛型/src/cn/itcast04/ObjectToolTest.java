package cn.itcast04;

public class ObjectToolTest {

	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//		ot.setObj(new String("风清扬"));
//		String s1 = (String) ot.getObj();
//		System.out.println("姓名："+s1);
//		
//		
//		ot.setObj(new Integer(20));
//		Integer integer = (Integer) ot.getObj();
//		System.out.println("年龄："+integer);
//		
//		
//		ot.setObj(new String("林青霞"));
//		Integer ii = (Integer)ot.getObj();
//		System.out.println("姓名是："+ii);
		
		ObjectTool<String> obj =new ObjectTool<String>();
//		obj.setObj(new Integer(27));
		obj.setObj(new String("林青霞"));
		String s=obj.getObj();
		System.out.println("姓名："+s);
		
		ObjectTool<Integer> ot =new ObjectTool<Integer>();
		ot.setObj(new Integer(18));
		Integer ii = ot.getObj();
		System.out.println("年龄："+ii);
	}

}
