package com.pwd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SqrtPrimeNumber {

	
	public static void main(String[] args) {
		//System.out.println(isPrime(7))
		
		 String[] fruitArray= {"Apple","Banana","Apple","Orange"};
		 
		 Set<String> fruitset= new HashSet<>();
		 
		 Arrays.asList(fruitArray).stream().filter(i->!fruitset.add(i)).forEach(n->System.out.println(n));
		 
		 //List<>Arrays.asList(fruitArray).stream().filter(i->!fruitset.add(i)).forEach(n->System.out.println(n));

		 
			/*
			 * List<Double> list = Stream.iterate(1, i->i+1)
			 * .filter(SqrtPrimeNumber::isPrime).peek(y-> System.out.println(y))
			 * .map(Math::sqrt).peek(y-> System.out.println(y)) .limit(10)
			 * .collect(Collectors.toList());
			 */
	
	}

	private static boolean isPrime(int number) {
		
		return number>1 && IntStream.range(2, number).noneMatch(n-> number%n==0);
	}
	
	
	
	
	
		
	
	
}
