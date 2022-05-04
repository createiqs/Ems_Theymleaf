package com.creatieiq.ems.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.creatieiq.ems.pojo.Employee;

@Repository
public class EmployeeDao {

	static List<Employee> employees = Arrays.asList(new Employee(1, "sai", 15000.00),
			new Employee(2, " madhuri", 25000.00));

	public List<Employee> getAll() {
		return employees;
	}

//	public static void main(String[] args) {
//		EmployeeDao dao = new EmployeeDao();
//		List<Employee> emps = dao.getAll();
//		for (Employee employee : emps) {
//			System.out.println(employee);
//		}
//	}

}
