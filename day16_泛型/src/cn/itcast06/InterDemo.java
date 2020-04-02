package cn.itcast06;

public class InterDemo {

	public static void main(String[] args) {
		InterImpl<String> ii = new InterImpl<String>();
		ii.show("string");
		InterImpl<Integer> i1 = new InterImpl<Integer>();
		ii.show(100);
	}
}
