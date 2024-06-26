package com.pwd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {
	public static void main(String[] args) {
		String str ="welcome to code decode and code decode welcome you";
		List<String> list = Arrays.asList(str.split(" "));

		 
		Map<String,Long>  map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		
		
	
	String fruitArray[] = {"Apple", "Banana", "Orange", "Apple"};

	Map<String,Long>  newmap  = new HashMap<>();

	for (String s:fruitArray) {
		
		newmap.put(s,  newmap.getOrDefault(s, (long) 0)+1);
		
		
	}
	
	System.out.println(newmap);

	}

}
