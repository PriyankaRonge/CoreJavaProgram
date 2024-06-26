package com.pwd;

import java.util.Comparator;

public class NameCompartor implements Comparator<EmployeeC> {


	@Override
	public int compare(EmployeeC o1, EmployeeC o2) {
		return o1.name.compareTo(o2.name);
	}

}
