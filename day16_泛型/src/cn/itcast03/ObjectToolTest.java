package cn.itcast03;

public class ObjectToolTest {

	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();
		ot.setObj(new Integer(100));
		Integer i = (Integer) ot.getObj();
		
		System.out.println("年龄是："+i);
		
		ot.setObj("梁青霞");
		String str = (String) ot.getObj();
		System.out.println("姓名："+str);
	}

}
