package com.pwd;

import java.util.stream.IntStream;

public class PrimeNumer {

	public static void main(String[] args) {
		
		System.out.println(isPrime(7));
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		return number>1 && IntStream.range(2, number).noneMatch(n-> number%n==0);
		//boolean isDivisible=false;
		/*
		 * for (int i=2;i<number;i++) { if(number%i==0) { isDivisible = true; break; } }
		 */
		
		//return isDivisible;
	}
}
