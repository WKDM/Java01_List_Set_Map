package cn.itcast02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "���μ�");
		hm.put(2, "ˮ䰴�");
		hm.put(3, "��¥��");
		hm.put(4, "��������");
		Set<Integer> set = hm.keySet();
		for(Integer integer : set){
			String value = hm.get(integer);
			System.out.println(integer+"===="+value);
		}
		System.out.println("hm="+hm);
	}

}
