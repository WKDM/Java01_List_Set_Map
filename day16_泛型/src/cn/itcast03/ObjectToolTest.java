package cn.itcast03;

public class ObjectToolTest {

	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();
		ot.setObj(new Integer(100));
		Integer i = (Integer) ot.getObj();
		
		System.out.println("�����ǣ�"+i);
		
		ot.setObj("����ϼ");
		String str = (String) ot.getObj();
		System.out.println("������"+str);
	}

}
