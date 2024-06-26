package com.pwd;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Dev");
		map.put(null,"App");
		map.put(4,"Tester");
		
		System.out.println(map);
		
		for(Map.Entry<Integer,String> entry :map.entrySet()) {
		System.out.println("key :"+entry.getKey() + " Value :" +entry.getValue());	
		}
		
	}

}
