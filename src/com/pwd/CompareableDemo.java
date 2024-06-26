package com.pwd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareableDemo {
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<>();
		al.add(new Student(1, "priyansh", 22));
		al.add(new Student(2, "rajvie", 18));
		al.add(new Student(3, "sunidhi", 23));
		
		
		Collections.sort(al);
		for(Student s :al) {
			System.out.println(" "+s.name + " "+s.age);
		}
	}

}
