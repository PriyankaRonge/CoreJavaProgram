package com.pwd;

import java.util.Comparator;

public class AgeCompartor implements Comparator<EmployeeC> {


	@Override
	public int compare(EmployeeC o1, EmployeeC o2) {
		if(o1.age == o2.age)
			return 0;
		else if(o1.age > o1.age)
			return 1;
		else
			return -1;
	}

}
