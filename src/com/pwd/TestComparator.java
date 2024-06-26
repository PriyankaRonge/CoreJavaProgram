package com.pwd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	
	public static void main(String[] args) {
		
		List<EmployeeC> list = new ArrayList<>();
				list.add(new EmployeeC (1,"Pooname",1,46));
				list.add(new EmployeeC (2,"raya",1,20));
				list.add(new EmployeeC (3,"ninja",1,23));
				list.add(new EmployeeC (4,"motu",1,35));
				
				System.out.println("sort by age");
				Collections.sort(list,new AgeCompartor());
				
				
				 for (EmployeeC e :list) {
					 System.out.println("" + e.name + " "+e.age);
				 }
				
				
				System.out.println("sort by Name");
				Collections.sort(list,new NameCompartor());
				 for (EmployeeC e :list) {
					 System.out.println("" + e.name + " "+e.age);
				 }
				
	}

}
