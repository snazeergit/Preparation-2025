package com.nt.streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Fetch top 2 departments having more than 1 employee
 * with salary > 1000, sorted by employee count descending.
 */
public class StreamsPrep {

	public static void main(String[] args) {

		List<Employee> empList = Employee.getEmpList();

		/* 
		 * Dept wise emps whose sal >1000 
		 */
		Map<String, List<Employee>> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept_Name, Collectors.collectingAndThen(Collectors.toList(),
						list -> list.stream().filter(e -> e.getSalary() > 1000).toList())));
		// System.out.println(map);

		/*
		 * Filtering depts who are having more than 1 emp
		 * Sorting based on dept name
		 * collect top 2 dept
		 */
		LinkedHashMap<String, List<Employee>> map2 = map.entrySet().stream().filter(e -> e.getValue().size() > 1)
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).limit(2).collect(Collectors
						.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldV, newV) -> oldV, LinkedHashMap::new));

		// System.out.println(map2);

		map2.forEach((k, v) -> {
			System.out.println(k + " :");
			for (Employee emp : v) {
				System.out.println("\t" + emp.getEmp_Name());
			}
		});
	}

}
