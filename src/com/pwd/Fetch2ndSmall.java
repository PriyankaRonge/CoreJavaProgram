package com.pwd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fetch2ndSmall {
	public static void main(String[] args) {
		 
		int[] list = {8,2,5,3,1,7,1};
		
		int secondl = Arrays.stream(list)
									.distinct()
									.sorted()
									.skip(1)
									.findFirst().orElseThrow(()-> new IllegalArgumentException("Array does not have"));
		// System.out.println(secondl);
		 
		 
		 int[] a1 = {1,2,3,4,5};
		 int[] a2 = {4,5,6,7,8};
		 
		 String fruitArray[] = {"Apple", "Bananana", "Orange", "Apple"};
		 
		 
		 //fetchCommonElements(a1,a2);
		 printLenLongestArray(fruitArray);
		 
		 
	
	}

	private static void printLenLongestArray(String[] fruitArray) {
	
		
				int max = Arrays.stream(fruitArray).mapToInt(s->s.length()).peek(i -> System.out.println(i)).max().orElse(0);
				System.out.println(max);
				

	}

	private static void fetchCommonElements(int[] a1, int[] a2) {

		
		List<Integer> Common = Arrays.stream(a1).filter(n -> Arrays.stream(a2).anyMatch(n2 -> n2==n)).boxed().collect(Collectors.toList());
		System.out.println(Common);
	}

}
