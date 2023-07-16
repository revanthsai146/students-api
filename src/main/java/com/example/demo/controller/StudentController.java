package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceImpl;
@RestController
@RequestMapping("/api/students")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentServiceImpl studentService;
   // @RequestMapping("/v1")
    @GetMapping("/health-check")
    public String HelloWorld() {
    	return "Hello World";
    }
    
    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student savedStudent = studentService.save(student);
        return ResponseEntity.ok(savedStudent);
    }
    
    
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
    	logger.info("Getting all students");
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
    	logger.info("Getting student with id: {}", id);
        Optional<Student> student = studentService.getStudentById(id);
        
        if(student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id) {
    	logger.info("Deleting student with id: {}", id);
        studentService.deleteStudentById(id);
        return ResponseEntity.ok().build();
    }
}

	


