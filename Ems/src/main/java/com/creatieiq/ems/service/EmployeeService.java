package com.creatieiq.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creatieiq.ems.dao.EmployeeDao;
import com.creatieiq.ems.pojo.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> findAll() {
		return employeeDao.getAll();
	}

}
