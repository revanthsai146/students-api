package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentInterface;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentInterface{

	
	@Autowired
	private StudentRepo repo;
	
	
    
    @Override
    public Student save(Student student) {
        return repo.save(student);
    }



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}



	@Override
	public Optional<Student> getStudentById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}



	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
		
	}
    
    
}