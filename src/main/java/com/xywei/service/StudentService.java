package com.xywei.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.xywei.domain.Student;

@WebService
public interface StudentService {

	Student findById();

	List<Student> findByIdAndAge(@WebParam(name = "id") String id, @WebParam(name = "age") Integer age);
}
