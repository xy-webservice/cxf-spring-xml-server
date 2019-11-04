package com.xywei.service;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.xywei.domain.Employee;

/**
 * REST服务 直接提供数据，数据可以是XML或者JSON格式
 * 
 * @author future
 * @Datetime 2019年11月4日 下午4:47:47<br/>
 * @Description
 */
@WebService
@Path("/employee")
public interface EmployeeInterface {

	@GET
	@Path("/findEmployeesByAgeAndSaraly/{age}/{salary}")
	@Produces(MediaType.APPLICATION_XML)
	List<Employee> findEmployeesByAgeAndSaraly(@PathParam("age") Integer age, @PathParam("salary") BigDecimal salary);

	@GET
	@Path("/findEmployeesAll")
	@Produces(MediaType.APPLICATION_JSON)
	List<Employee> findEmployeesAll();

	@GET
	@Path("/findEmployeeById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	Employee findEmployeeById(@PathParam("id") String id);

	@GET
	@Path("/findEmployeeById_xml/{id}")
	@Produces(MediaType.APPLICATION_XML)
	Employee findEmployeeById_xml(@PathParam("id") String id);

}
