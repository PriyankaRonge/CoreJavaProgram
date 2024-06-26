package com.pwd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		//List<Integer> list = new ArrayList<Integer>();
		List<Integer> list = Arrays.asList(10,28,87,10,20,76,28);
		Set<Integer> set = new HashSet<>();
	   list.stream().filter(i->!set.add(i)).forEach(System.out::println);
		
		list.stream().limit(3).forEach(System.out::println);
		System.out.println("skip.....");
		list.stream().skip(3).forEach(System.out::println);
	//	List<String> names = Arrays.asList("aa","bb","cc","cc","aa","dd");
		//sSet<String>  nameset  = new HashSet<>();
		//names.stream().filter(i-> !nameset.add(i)).forEach(System.out::println);
				 
	}
}
