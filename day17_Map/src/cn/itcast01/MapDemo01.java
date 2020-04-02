package cn.itcast01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ÖÜ½ÜÂ×", "À¥Áè");
		map.put("»ÆÏşÃ÷", "ÑîÓ±");
		map.put("ÁõâıÍş", "ÑîÃİ");
		map.put("µË³¬", "ËïÙ³");
		System.out.println("map:"+map);
		
		//void clear()
//		map.clear();
//		System.out.println("clrar:"+map);
		
//		void remove()		
//		map.remove("ÖÜ½ÜÂ×");
//		System.out.println("remove:"+map);
		
//		boolean containsKey()		
		System.out.println(map.containsKey("ÖÜ½ÜÂ×"));
		System.out.println(map.containsKey("ĞíáÔ"));
		System.out.println(map.containsValue("ÑîÃİ"));
		
		//int size()
		System.out.println("map.size"+map.size());
	}
}
