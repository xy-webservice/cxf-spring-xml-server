package com.xywei.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.xywei.domain.Student;
import com.xywei.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student findById() {
		return new Student("001", "AAA", 18);
	}

	@Override
	public List<Student> findByIdAndAge(String id, Integer age) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("002", "2BBB", 23));
		students.add(new Student("003", "3CCC", 23));
		students.add(new Student("004", "4DDD", 23));
		students.add(new Student("005", "5EEE", 23));

		return students;
	}

}
