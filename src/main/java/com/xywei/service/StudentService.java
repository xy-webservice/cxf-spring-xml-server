package com.xywei.service;

import java.util.List;

import javax.jws.WebService;

import com.xywei.domain.Student;

@WebService
public interface StudentService {

	Student findById();
	
	List<Student> findByIdAndAge(String id, Integer age);
}
