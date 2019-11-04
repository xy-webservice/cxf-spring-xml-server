package com.xywei.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xywei.domain.Employee;
import com.xywei.service.EmployeeInterface;

/**
 * 
 * @author future
 * @Datetime 2019年11月4日 下午4:47:28<br/>
 * @Description
 */
public class EmployeeInterfaceImpl implements EmployeeInterface {

	private static List<Employee> employeeList = new ArrayList<Employee>();

	static {
		employeeList.add(new Employee("001", "长江1号", 20, BigDecimal.valueOf(9999L)));
		employeeList.add(new Employee("002", "长江2号", 21, BigDecimal.valueOf(99L)));
		employeeList.add(new Employee("003", "长江3号", 22, BigDecimal.valueOf(10000L)));
		employeeList.add(new Employee("004", "长江4号", 21, BigDecimal.valueOf(1000L)));
		employeeList.add(new Employee("005", "长江5号", 22, BigDecimal.valueOf(9L)));
		employeeList.add(new Employee("006", "长江6号", 23, BigDecimal.valueOf(1000L)));
		employeeList.add(new Employee("007", "长江7号", 21, BigDecimal.valueOf(99L)));

	}

	@Override
	public List<Employee> findEmployeesAll() {

		return employeeList;
	}

	@Override
	public List<Employee> findEmployeesByAgeAndSaraly(Integer age, BigDecimal salary) {
		List<Employee> employees = new ArrayList<Employee>();

//		employees = employeeList.stream()
//				.filter((emp) -> (((emp.getAge()) == age )&& (emp.getSalary().compareTo(salary) == 0)))
//				.collect(Collectors.toList());

		employees = employeeList.stream().filter(emp -> emp.getAge().compareTo(age) == 0)
				.filter(emploee -> emploee.getSalary().compareTo(salary) == 0).collect(Collectors.toList());

		return employees;
	}

	@Override
	public Employee findEmployeeById(String id) {
		Employee employee = employeeList.stream().filter((Employee emp) -> emp.getId().equals(id)).findAny().get();
		return employee;
	}

	@Override
	public Employee findEmployeeById_xml(String id) {
		Employee employee = employeeList.stream().filter((Employee emp) -> emp.getId().equals(id)).findAny().get();
		return employee;
	}

}
