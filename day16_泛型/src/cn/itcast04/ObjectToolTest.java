package cn.itcast04;

public class ObjectToolTest {

	public static void main(String[] args) {
//		ObjectTool ot = new ObjectTool();
//		ot.setObj(new String("������"));
//		String s1 = (String) ot.getObj();
//		System.out.println("������"+s1);
//		
//		
//		ot.setObj(new Integer(20));
//		Integer integer = (Integer) ot.getObj();
//		System.out.println("���䣺"+integer);
//		
//		
//		ot.setObj(new String("����ϼ"));
//		Integer ii = (Integer)ot.getObj();
//		System.out.println("�����ǣ�"+ii);
		
		ObjectTool<String> obj =new ObjectTool<String>();
//		obj.setObj(new Integer(27));
		obj.setObj(new String("����ϼ"));
		String s=obj.getObj();
		System.out.println("������"+s);
		
		ObjectTool<Integer> ot =new ObjectTool<Integer>();
		ot.setObj(new Integer(18));
		Integer ii = ot.getObj();
		System.out.println("���䣺"+ii);
	}

}
