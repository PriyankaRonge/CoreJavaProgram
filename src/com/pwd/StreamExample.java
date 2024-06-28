package com.pwd;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Welcome to ","W","O","R");
		
		Long s1 = System.currentTimeMillis();
		
		list.stream().forEach(System.out::print);

		Long e1 = System.currentTimeMillis();
				
		System.out.println("Time taken by Sequential Stream : "+(e1-s1));
		
		
		
     Long s2 = System.currentTimeMillis();
		
		list.parallelStream().forEach(System.out::print);

		Long e2 = System.currentTimeMillis();
		
		
		System.out.println("Time taken by Sequential Stream : "+(e2-s2));


	}
	

}
