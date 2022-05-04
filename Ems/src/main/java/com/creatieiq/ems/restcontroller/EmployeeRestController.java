package com.creatieiq.ems.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.creatieiq.ems.pojo.Employee;
import com.creatieiq.ems.service.EmployeeService;

@RestController
@RequestMapping(value = "/rest")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

//	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	@GetMapping(value = "/employees")
	public List<Employee> getAll() {
		return employeeService.findAll();
	}

}
