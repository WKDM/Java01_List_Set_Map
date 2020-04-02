package cn.itcast01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ÖÜ½ÜÂ×", "À¥Áè");
		map.put("»ÆÏşÃ÷", "ÑîÓ±");
		map.put("ÁõâıÍş", "ÑîÃİ");
		map.put("µË³¬", "ËïÙ³");
		System.out.println("map:"+map);
	}
}
