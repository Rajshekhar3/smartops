package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;

@RestController      //@Rest + @ResponseBody
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	StudentRepository repository;
	
	
	@PostMapping("student")
	public void addStudent(@RequestBody Student stud)
	{
		repository.save(stud);
	}
	
	
	
	@GetMapping("student")
	public List<Student> getStudent()
	{
		return repository.findAll();
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable ("id") Long studId)
	{
		repository.deleteById(studId);
		//repository.deleteById(studId);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable ("id") Long studId)
	{
		Optional<Student> student = repository.findById(studId);
		//return  Student repository.findById(studId);
		return ResponseEntity.ok(student.get());
	}
	
	
	
	/*@GetMapping
	//@ResponseBody
	public String getMessage() {
		return "Hello from Spring Boot!";
	}*/
	
	/*@GetMapping("student")
	public List<Student> student () {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student("Rahul","Sharma",112,"A+"));
		studList.add(new Student("Priya","Sharan",123,"A+"));
		studList.add(new Student("Sneha","Patil",124,"A+"));
		studList.add(new Student("Raj","Verma",115,"B+"));
		studList.add(new Student("David","Miller",111,"B"));
		return studList;
		
		
	}*/

}
