package cn.itcast02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "西游记");
		hm.put(2, "水浒传");
		hm.put(3, "红楼梦");
		hm.put(4, "三国演义");
		Set<Integer> set = hm.keySet();
		for(Integer integer : set){
			String value = hm.get(integer);
			System.out.println(integer+"===="+value);
		}
		System.out.println("hm="+hm);
	}

}
