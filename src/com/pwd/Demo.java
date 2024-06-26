package com.pwd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		System.out.println("welcom to programming world");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(44);
		list.add(89);
		list.add(15);
		list.add(24);
		list.add(1);
		
		// print greater than 5
		
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer i:list) {
			if(i>5)
				newList.add(i);
		}
		for (Integer i:newList) {
			//System.out.println(i);
		}
		list.stream().forEach(System.out::println);
		
		System.out.println("after ");
		// java 8
		//list.stream().filter(i->i>5).forEach(i-> System.out.println(i));
		
		//System.out.println("square");

		//list.stream().map(i-> i*i).forEach( i-> System.out.println(i));
		//list.stream().sorted().forEach(i -> System.out.println(i));

		//list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(i -> System.out.println(i));
	
		//System.out.println("minimum val: "+list.stream().min((i1,i2) ->i1.compareTo(i2)).get());
		//System.out.println("max values:" + list.stream().max((i1,i2) -> i1.compareTo(i2)).get());
		
		//System.out.println("max value: "+ list.stream().max((i1,i2)->i1.compareTo(i2)).get());
		//System.out.println("max value :"+list.stream().max((i1,i2)->i1.compareTo(i2)).get());
		
		//System.out.println("count of apple :"+Stream.of("apple","banana","oriange","apple").filter(i -> i.equals("apple")).count());
		  
		list.stream().filter(i -> i%2==0).peek(System.out::println).map(a-> a+a).filter(i->i>5).forEach(i-> System.out.println(i));
		
		
	} 
}
