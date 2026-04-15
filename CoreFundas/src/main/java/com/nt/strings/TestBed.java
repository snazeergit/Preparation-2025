package com.nt.strings;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nt.streams.Employee;

public class TestBed {

	public static void main(String[] args) {

		/*
		 * Fetch top 2 departments having more than 1 employee
		 * with salary > 1000, sorted by employee count descending.
		 */
		List<Employee> empList = Employee.getEmpList();

		LinkedHashMap<String,Long> map = empList.stream().filter(e -> e.getSalary() > 1000)
				.collect(Collectors.groupingBy(Employee::getDept_Name, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldV, newV) -> oldV, LinkedHashMap::new));
		System.out.println(map);

	}
}
