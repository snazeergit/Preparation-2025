package com.nt.util;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer emp_Id;
	private String emp_Name;
	private Double salary;
	private String dept_Name;
	private Integer dept_Id;

	public Integer getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(Integer emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDept_Name() {
		return dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		this.dept_Name = dept_Name;
	}

	public Integer getDept_Id() {
		return dept_Id;
	}

	public void setDept_Id(Integer dept_Id) {
		this.dept_Id = dept_Id;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", salary=" + salary + ", dept_Name="
				+ dept_Name + ", dept_Id=" + dept_Id + "]";
	}

	public Employee(Integer emp_Id, String emp_Name, Double salary, String dept_Name, Integer dept_Id) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.salary = salary;
		this.dept_Name = dept_Name;
		this.dept_Id = dept_Id;
	}

	public static List<Employee> getEmpList() {
		Employee e1 = new Employee(1, "Nazeer", 4000.0, "IT", 101);
		Employee e2 = new Employee(2, "Maruthi", 4000.0, "Sales", 102);
		Employee e3 = new Employee(3, "Madhu", 2000.0, "IT", 101);
		Employee e4 = new Employee(4, "Lalli", 7000.0, "HR", 103);
		Employee e5 = new Employee(5, "Kala", 3000.0, "HR", 103);
		Employee e6 = new Employee(6, "Nutan", 8000.0, "IT", 101);
		Employee e7 = new Employee(7, "Mara", 4000.0, "Sales", 102);
		Employee e8 = new Employee(8, "Nani", 9000.0, "Sales", 102);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		return list;
	}

}
