package com.pwd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpSalarySort {

	public static void main(String[] args) {
		
		List<Employee> emp = getEmpList();
		/*
		 * List<Employee> emp1 = emp.stream().sorted((o1,o2)-> (o2.getSalary() -
		 * o1.getSalary())) .limit(2) .collect(Collectors.toList());
		 * emp1.stream().forEach(e->System.out.println(e.getSalary()));
		 * 
		 */
		
        
        List<Worker> wrk = geWrkList();;
		Map<Integer, List<Worker>>  resp = wrk.stream().collect(Collectors.groupingBy(w ->w.getAge()));
		
		System.out.println(resp);
		

	}

	private static List<Worker> geWrkList() {
		List<Worker> wrk = new ArrayList();
		Worker e1 = new Worker();
		
		e1.setName("code");
		e1.setAge(30);

		Worker e2 = new Worker();
		e2.setName("code1");
		e2.setAge(10);

		Worker e3 = new Worker();
		e3.setName("code");
		e3.setAge(38);
		
		Worker e4 = new Worker();
		e4.setName("code2");
		e4.setAge(42);

		wrk.add(e1);
		wrk.add(e2);
		wrk.add(e3);
		wrk.add(e4);
		
		return wrk;
	}

	private static List<Employee> getEmpList() {
		List<Employee> emp = new ArrayList();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("priy");
		e1.setSalary(5000);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("priy");
		e2.setSalary(100);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("priy");
		e3.setSalary(389);
		
		Employee e4 = new Employee();
		e4.setId(3);
		e4.setName("priy");
		e4.setSalary(7000);

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		return emp;
	}
}
