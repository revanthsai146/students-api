package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentInterface {
	public Student save(Student student);
	public List<Student> getAllStudents();
	public Optional<Student> getStudentById(Long id);
	public void deleteStudentById(Long id);

}
